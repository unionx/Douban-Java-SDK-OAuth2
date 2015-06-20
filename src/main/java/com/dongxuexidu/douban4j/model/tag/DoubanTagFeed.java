package com.dongxuexidu.douban4j.model.tag;

import com.dongxuexidu.douban4j.model.feed.DoubanFeed;
import com.google.api.client.util.Key;

import java.util.List;

/**
 * Created by unionx on 15/6/20.
 */
public class DoubanTagFeed extends DoubanFeed {

    @Key
    private List<DoubanTag> tags;

    public List<DoubanTag> getTags() {
        return tags;
    }

    public void setTags(List<DoubanTag> tags) {
        this.tags = tags;
    }
}
