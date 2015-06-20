package com.dongxuexidu.douban4j.model.book;

import com.dongxuexidu.douban4j.model.search.DoubanSearchResult;
import com.google.api.client.util.Key;

import java.util.List;

/**
 * Created by unionx on 15/6/20.
 */
public class DoubanBookSearchResult extends DoubanSearchResult {

    @Key
    private List<DoubanBook> books;

    public List<DoubanBook> getBooks() {
        return books;
    }

    public void setBooks(List<DoubanBook> books) {
        this.books = books;
    }
}
