package com.dongxuexidu.douban4j.service;

import com.dongxuexidu.douban4j.model.app.DoubanException;
import com.dongxuexidu.douban4j.model.subject.DoubanSubjectFeedObj;
import com.dongxuexidu.douban4j.utils.ErrorHandler;
import com.dongxuexidu.douban4j.utils.HttpManager;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Zhibo Wei <uglytroll@dongxuexidu.com>
 */
public abstract class DoubanService {

    protected HttpManager client = null;
    private static final Log log = LogFactory.getLog(DoubanService.class);

    protected DoubanService() {
        this.client = new HttpManager();
    }

    protected DoubanService(String accessToken) {
        this.client = new HttpManager(accessToken);
    }

    protected void setAccessToken(String accessToken) throws DoubanException {
        if (accessToken == null || accessToken.isEmpty()) {
            throw ErrorHandler.accessTokenNotSet();
        }
        this.client.setAccessToken(accessToken);
    }

    protected DoubanSubjectFeedObj searchDoubanSubject(String url, String q, String tag,
                                                       Integer startIndex, Integer maxResult)
            throws DoubanException, IOException {

        List<NameValuePair> params = new ArrayList<NameValuePair>();
        if (q != null && q.length() > 0) {
            params.add(new BasicNameValuePair("q", q));
        }
        if (tag != null && tag.length() > 0) {
            params.add(new BasicNameValuePair("tag", tag));
        }
        if (params.isEmpty()) {
            throw ErrorHandler.missingRequiredParam();
        }
        if (startIndex != null) {
            params.add(new BasicNameValuePair("start-index", startIndex.toString()));
        }
        if (maxResult != null) {
            params.add(new BasicNameValuePair("max-results", maxResult.toString()));
        }

        return this.client.getResponseInJson(url, params, DoubanSubjectFeedObj.class, false);
    }

}
