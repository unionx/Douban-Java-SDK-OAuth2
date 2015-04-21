package com.dongxuexidu.douban4j.service;

import com.dongxuexidu.douban4j.constants.RequestUrls;
import com.dongxuexidu.douban4j.model.app.DoubanException;
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
}
