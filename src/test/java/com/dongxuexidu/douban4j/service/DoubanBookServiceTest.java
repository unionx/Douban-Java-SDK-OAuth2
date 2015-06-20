package com.dongxuexidu.douban4j.service;

import com.dongxuexidu.douban4j.constants.DefaultConfigs;
import com.dongxuexidu.douban4j.model.subject.DoubanSubjectFeedObj;
import com.dongxuexidu.douban4j.model.subject.DoubanSubjectObj;
import junit.framework.TestCase;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by unionx on 15/4/22.
 * Tests for DoubanBookService
 */

public class DoubanBookServiceTest extends TestCase {

    private final static Log log = LogFactory.getLog(DoubanBookServiceTest.class);
    DoubanBookService doubanBookService;

    protected void setUp() {
        log.info("Testing DoubanBookService......");
        DefaultConfigs.TEST_API_KEY = "0ba4e3363b4682bb22eea9a2b1d38831";
        doubanBookService = new DoubanBookService();
    }

    public void testGetBookInfoById() throws Exception {
        log.info("Testing getBookInfoById");
        long bookId = 10440147L;
        DoubanSubjectObj doubanSubjectObj = doubanBookService.getBookInfoById(bookId);
        assertEquals(doubanSubjectObj.getTitle(), "世间的名字");
    }

    public void testGetBookInfoByISBN() throws Exception {
        log.info("Testing getBookInfoByISBN");
        String isbn = "9787101065510";
        DoubanSubjectObj doubanSubjectObj = doubanBookService.getBookInfoByISBN(isbn);
        assertEquals(doubanSubjectObj.getTitle(), "淮南子");
    }

    public void testSearchBook() throws Exception {
        log.info("Testing searchBook");
        String q = "C语言";
        DoubanBookService doubanBookService = new DoubanBookService();
        DoubanSubjectFeedObj subjectFeedObj = doubanBookService.searchBook(q, null);
        assertTrue(subjectFeedObj.getBooks().size() > 0);
    }

}
