package com.dongxuexidu.douban4j.model.collection;

import com.dongxuexidu.douban4j.model.book.DoubanBook;
import com.dongxuexidu.douban4j.model.common.DoubanRating;
import com.google.api.client.json.JsonString;
import com.google.api.client.util.Key;

/**
 * @author Zhibo Wei <uglytroll@dongxuexidu.com>
 */

public class DoubanCollection  {

    @Key
    private String status;

    @Key
    private String updated;

    @Key
    @JsonString
    private Integer user_id;

    @Key
    @JsonString
    private Integer book_id;

    @Key
    private Integer id;

    @Key
    private DoubanRating rating;

    @Key
    private DoubanBook book;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getBook_id() {
        return book_id;
    }

    public void setBook_id(Integer book_id) {
        this.book_id = book_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public DoubanRating getRating() {
        return rating;
    }

    public void setRating(DoubanRating rating) {
        this.rating = rating;
    }

    public DoubanBook getBook() {
        return book;
    }

    public void setBook(DoubanBook book) {
        this.book = book;
    }
}
