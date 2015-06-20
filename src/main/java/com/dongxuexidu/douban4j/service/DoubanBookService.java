package com.dongxuexidu.douban4j.service;

import com.dongxuexidu.douban4j.constants.RequestUrls;
import com.dongxuexidu.douban4j.model.app.DoubanException;
import com.dongxuexidu.douban4j.model.subject.DoubanSubjectFeedObj;
import com.dongxuexidu.douban4j.model.subject.DoubanSubjectObj;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.IOException;


/**
 * Created by unionx on 15/4/22.
 * Service for douban book
 */

public class DoubanBookService extends DoubanService {

    private static final Log log = LogFactory.getLog(DoubanBookService.class);

    public DoubanBookService() {
        super();
    }

    public DoubanBookService(String accessToken) {
        super(accessToken);
    }

    public DoubanSubjectObj getBookInfoById(long bookId)
            throws DoubanException, IOException {
        String url = RequestUrls.DOUBAN_BOOK_SUBJECT_PREFIX + "/" + bookId;
        return this.client.getResponseInJson(url, null, DoubanSubjectObj.class, false);
    }

    public DoubanSubjectObj getBookInfoByISBN(String isbn)
            throws DoubanException, IOException {
        String url = RequestUrls.DOUBAN_BOOK_SUBJECT_PREFIX + "/isbn/" + isbn;
        return this.client.getResponseInJson(url, null, DoubanSubjectObj.class, false);
    }

    public DoubanSubjectFeedObj searchBook(String q, String tag)
            throws DoubanException, IOException {
        String url = RequestUrls.DOUBAN_BOOK_SUBJECT_PREFIX + "/search";
        return searchDoubanSubject(url, q, tag, null, null);
    }

}
