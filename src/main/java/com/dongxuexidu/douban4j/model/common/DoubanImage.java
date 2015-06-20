package com.dongxuexidu.douban4j.model.common;

import com.dongxuexidu.douban4j.model.IDoubanObject;

/**
 * @author Sean Guo <seanguo85@qq.com>
 */
public class DoubanImage implements IDoubanObject {

    @Override
    public String getObjName() {
        return "image";
    }

    private String small;

    private String medium;

    private String large;

    public String getSmall() {
        return small;
    }

    public void setSmall(String small) {
        this.small = small;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        this.large = large;
    }

    @Override
    public String toString() {
        return "DoubanImage [small=" + small + ", medium=" + medium
                + ", large=" + large + "]";
    }
}
