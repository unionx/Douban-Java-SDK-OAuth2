package com.dongxuexidu.douban4j.service;

import com.dongxuexidu.douban4j.model.subject.DoubanSubjectFeedObj;
import com.dongxuexidu.douban4j.model.subject.DoubanSubjectObj;
import junit.framework.TestCase;

import java.util.logging.Logger;

/**
 * Created by unionx on 15/4/22.
 */
public class DoubanBookServiceTest extends TestCase {

  final static Logger logger = Logger.getLogger(DoubanBookServiceTest.class.getName());
  DoubanBookService doubanBookService = new DoubanBookService();

  public void testGetBookInfoById() throws Exception {
    logger.info("Testing getBookInfoById");
    long bookId = 10440147L;
    DoubanSubjectObj doubanSubjectObj = doubanBookService.getBookInfoById(bookId);
    assertEquals(doubanSubjectObj.getTitle(), "世间的名字");
  }

  public void testGetBookInfoByISBN() throws Exception {
    logger.info("Testing getBookInfoByISBN");
    String isbn = "9787101065510";
    DoubanSubjectObj doubanSubjectObj = doubanBookService.getBookInfoByISBN(isbn);
    assertEquals(doubanSubjectObj.getTitle(), "淮南子");
  }

  public void testSearchBook() throws Exception {
    logger.info("Testing searchBook");
    String q = "C语言";
    String tag = null;
    DoubanBookService doubanBookService = new DoubanBookService();
    DoubanSubjectFeedObj subjectFeedObj = doubanBookService.searchBook(q, tag);
    assertTrue(subjectFeedObj.getBooks().size() > 0);
  }

}
