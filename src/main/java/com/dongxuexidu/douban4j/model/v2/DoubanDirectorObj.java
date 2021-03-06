package com.dongxuexidu.douban4j.model.v2;

import com.dongxuexidu.douban4j.model.IDoubanObject;
import com.dongxuexidu.douban4j.model.common.DoubanImage;
import com.google.api.client.util.Key;

/**
 * @author Sean Guo <seanguo85@qq.com>
 */
public class DoubanDirectorObj implements IDoubanObject {

    @Key
    private DoubanImage avatars;

    @Key
    private String alt;

    @Key
    private String id;

    @Key
    private String name;

    @Override
    public String getObjName() {
        return "DoubanDirectorObj";
    }

    public DoubanImage getAvatars() {
        return avatars;
    }

    public String getAlt() {
        return alt;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "DoubanDirectorObj [avatars=" + avatars + ", alt=" + alt + ", id=" + id + ", name=" + name + "]";
    }
}
