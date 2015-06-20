/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dongxuexidu.douban4j.model.tag;

import com.dongxuexidu.douban4j.model.IDoubanObject;
import com.google.api.client.util.Key;

/**
 * @author Zhibo Wei <uglytroll@dongxuexidu.com>
 */
public class DoubanTag implements IDoubanObject {

    @Override
    public String getObjName() {
        return "tag";
    }

    @Key
    private String name;

    @Key
    private Integer count;

    // title 和 name 貌似一样，没什么区别
    @Key
    private String title;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the count
     */
    public Integer getCount() {
        return count;
    }

    /**
     * @param count the count to set
     */
    public void setCount(Integer count) {
        this.count = count;
    }

}
