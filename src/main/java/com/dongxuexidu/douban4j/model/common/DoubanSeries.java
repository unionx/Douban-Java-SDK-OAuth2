package com.dongxuexidu.douban4j.model.common;

import com.dongxuexidu.douban4j.model.IDoubanObject;
import com.google.api.client.util.Key;

/**
 * Created by unionx on 15/4/22.
 */
public class DoubanSeries implements IDoubanObject {

    @Override
    public String getObjName() {
        return "series";
    }

    @Key
    public String id;

    @Key
    public String title;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
