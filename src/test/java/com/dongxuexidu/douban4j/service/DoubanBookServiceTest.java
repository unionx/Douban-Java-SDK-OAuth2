package com.dongxuexidu.douban4j.service;

import com.dongxuexidu.douban4j.model.subject.DoubanSubjectObj;
import junit.framework.TestCase;

import java.util.logging.Logger;

/**
 * Created by unionx on 15/4/22.
 */
public class DoubanBookServiceTest extends TestCase {

  final static Logger logger = Logger.getLogger(DoubanBookServiceTest.class.getName());

  public void testGetBookInfoById() throws Exception {
    logger.info("Testing getBookInfoById");
    long bookId = 10440147L;
    DoubanBookService doubanBookService = new DoubanBookService();
    DoubanSubjectObj doubanSubjectObj = doubanBookService.getBookInfoById(bookId);
    assertEquals(doubanSubjectObj.getTitle(), "世间的名字");
  }

}
