package com.dongxuexidu.douban4j.service;

import com.dongxuexidu.douban4j.constants.RequestUrls;
import com.dongxuexidu.douban4j.model.app.DoubanException;
import com.dongxuexidu.douban4j.model.book.DoubanBook;
import com.dongxuexidu.douban4j.model.book.DoubanBookFeed;
import com.dongxuexidu.douban4j.model.collection.DoubanCollection;
import com.dongxuexidu.douban4j.model.collection.DoubanCollectionFeed;
import com.dongxuexidu.douban4j.model.tag.DoubanTagFeed;
import com.dongxuexidu.douban4j.utils.HttpParamHelper;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.NameValuePair;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;

import java.io.IOException;
import java.util.List;


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

    public DoubanBook getBookInfoById(long bookId)
            throws DoubanException, IOException {
        String url = RequestUrls.DOUBAN_BOOK_SUBJECT_PREFIX + "/" + bookId;
        return this.client.getResponseInJson(url, null, DoubanBook.class, false);
    }

    public DoubanBook getBookInfoByISBN(String isbn)
            throws DoubanException, IOException {
        String url = RequestUrls.DOUBAN_BOOK_SUBJECT_PREFIX + "/isbn/" + isbn;
        return this.client.getResponseInJson(url, null, DoubanBook.class, false);
    }

    public DoubanBookFeed searchBook(String q, String tag) throws Exception {
        return searchBook(q, tag, null, null);
    }

    public DoubanBookFeed searchBook(String q, String tag, Integer start, Integer count)
            throws DoubanException, IOException {
        String url = RequestUrls.DOUBAN_BOOK_SUBJECT_PREFIX + "/search";
        return searchDoubanSubject(url, q, tag, start, count, DoubanBookFeed.class);
    }

    public DoubanTagFeed getBookTags(long bookId, Integer start, Integer count)
            throws Exception {
        String url = RequestUrls.DOUBAN_BOOK_SUBJECT_PREFIX + "/" + bookId + "/tags";

        return this.client.getResponseInJson(url,
                HttpParamHelper.buildParams("start", start, "count", count),
                DoubanTagFeed.class, false);
    }

    public DoubanTagFeed getUserBookTags(String username, Integer start, Integer count)
            throws Exception {
        String url = RequestUrls.DOUBAN_BOOK_SUBJECT_PREFIX
                + "/user/" + username + "/tags";

        return this.client.getResponseInJson(url,
                HttpParamHelper.buildParams("start", start, "count", count),
                DoubanTagFeed.class, false);
    }

    public DoubanTagFeed getUserBookTags(long userid, Integer start, Integer count)
            throws Exception {
        String url = RequestUrls.DOUBAN_BOOK_SUBJECT_PREFIX + "/user_tags/" + userid;

        return this.client.getResponseInJson(url,
                HttpParamHelper.buildParams("start", start, "count", count),
                DoubanTagFeed.class, false);
    }

    public DoubanCollectionFeed getUserBookCollection(String username,
                                                      Integer start, Integer count,
                                                      String status, String tag,
                                                      DateTime from, DateTime to,
                                                      Integer rating)
        throws Exception {
        String url = RequestUrls.DOUBAN_BOOK_SUBJECT_PREFIX + "/user/" + username + "/collections";

        String fromDatetime = from == null ? null : from.toString("yyyy-MM-dd'T'h:m:ssZ");
        String toDatetime = to == null ? null : to.toString("yyyy-MM-dd'T'h:m:ssZ");

        return this.client.getResponseInJson(url,
                HttpParamHelper.buildParams("start", start, "count", count,
                        "status", status, "tag", tag,
                        "from", fromDatetime,
                        "to", toDatetime,
                        "rating", rating),
                DoubanCollectionFeed.class, false);
    }

}
