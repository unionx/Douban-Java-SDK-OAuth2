package com.dongxuexidu.douban4j.model.subject;

import com.dongxuexidu.douban4j.model.IDoubanObject;
import com.google.api.client.util.Key;

/**
 * Created by dxu on 6/19/15.
 * Basic subject feed, search result of musics, books, movies, etc
 */
public class SubjectFeed {

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
