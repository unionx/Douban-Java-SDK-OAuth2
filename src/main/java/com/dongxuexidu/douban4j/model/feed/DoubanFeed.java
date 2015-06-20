package com.dongxuexidu.douban4j.model.feed;

import com.google.api.client.util.Key;

/**
 * Created by dxu on 6/19/15.
 * Basic subject collections, like search result of musics, books, movies, etc,
 * or collection of tags.
 */

public class DoubanFeed {

    @Key
    private Integer start;

    @Key
    private Integer count;

    @Key
    private Integer total;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
