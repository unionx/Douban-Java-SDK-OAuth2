package com.dongxuexidu.douban4j.service;

import com.dongxuexidu.douban4j.constants.RequestUrls;
import com.dongxuexidu.douban4j.model.app.DoubanException;
import com.dongxuexidu.douban4j.model.common.DoubanBook;
import com.dongxuexidu.douban4j.model.common.DoubanSubject;
import com.dongxuexidu.douban4j.model.subject.DoubanSubjectFeedObj;
import com.dongxuexidu.douban4j.model.subject.DoubanSubjectObj;

import java.io.IOException;
import java.util.logging.Logger;

/**
 * Created by unionx on 15/4/22.
 */

public class DoubanBookService extends DoubanService {

  final static Logger logger = Logger.getLogger(DoubanBookService.class.getName());

  public DoubanBookService() {
    super();
  }

  public DoubanBookService(String accessToken) {
    super(accessToken);
  }

  public DoubanSubjectObj getBookInfoById(long bookId)
    throws DoubanException, IOException {
    String url = RequestUrls.DOUBAN_BOOK_SUBJECT_PREFIX + "/"+ bookId;
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
