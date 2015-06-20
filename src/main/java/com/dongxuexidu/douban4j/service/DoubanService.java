package com.dongxuexidu.douban4j.service;

import com.dongxuexidu.douban4j.model.app.DoubanException;
import com.dongxuexidu.douban4j.model.search.DoubanSubjectFeedObj;
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

    protected <T> T searchDoubanSubject(String url, String q, String tag,
                                    Integer start, Integer count, Class<T> resultClass)
            throws DoubanException, IOException {

        List<NameValuePair> params = new ArrayList<>();

        if (q != null && q.length() > 0) {
            params.add(new BasicNameValuePair("q", q));
        }
        if (tag != null && tag.length() > 0) {
            params.add(new BasicNameValuePair("tag", tag));
        }
        // q和tag必传其一
        if (params.isEmpty()) {
            throw ErrorHandler.missingRequiredParam();
        }

        if (start != null) {
            params.add(new BasicNameValuePair("start", start.toString()));
        }
        if (count != null) {
            params.add(new BasicNameValuePair("count", count.toString()));
        }

        return this.client.getResponseInJson(url, params, resultClass, false);
    }

}
