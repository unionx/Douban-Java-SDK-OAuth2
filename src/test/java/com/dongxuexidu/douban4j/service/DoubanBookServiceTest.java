package com.dongxuexidu.douban4j.service;

import com.dongxuexidu.douban4j.constants.DefaultConfigs;
import com.dongxuexidu.douban4j.model.book.DoubanBook;
import com.dongxuexidu.douban4j.model.book.DoubanBookFeed;
import com.dongxuexidu.douban4j.model.tag.DoubanTag;
import com.dongxuexidu.douban4j.model.tag.DoubanTagFeed;
import junit.framework.TestCase;
import org.apache.commons.lang3.builder.ToStringBuilder;
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
        DoubanBook book = doubanBookService.getBookInfoById(bookId);
        assertEquals(book.getTitle(), "世间的名字");
    }

    public void testGetBookInfoByISBN() throws Exception {
        log.info("Testing getBookInfoByISBN");
        String isbn = "9787101065510";
        DoubanBook book = doubanBookService.getBookInfoByISBN(isbn);
        assertEquals(book.getTitle(), "淮南子");
    }

    public void testSearchBook() throws Exception {
        log.info("Testing searchBook");
        String q = "C语言";
        DoubanBookFeed doubanBookFeed = doubanBookService.searchBook(q, null);
        assertTrue(doubanBookFeed.getBooks().size() > 0);
    }

    public void testGetBookTags() throws Exception {
        log.info("Testing getBookTags");
        long bookId = 4833802L;
        DoubanTagFeed doubanTagFeed = doubanBookService.getBookTags(bookId, 20, 50);
        assertTrue(doubanTagFeed.getTags().size() == 50);
    }

    public void testGetUserBookTags() throws Exception {
        log.info("Testing getUserBookTags");
        String username = "unionz";
        DoubanTagFeed doubanTagFeed = doubanBookService.getUserBookTags(username, null, 50);
        doubanTagFeed.printAllTags();
        assertTrue(doubanTagFeed.getTags().size() == 50);
    }

}
