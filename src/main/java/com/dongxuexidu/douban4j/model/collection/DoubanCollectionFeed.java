package com.dongxuexidu.douban4j.model.collection;

import com.dongxuexidu.douban4j.model.feed.DoubanFeed;
import com.google.api.client.util.Key;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

/**
 * @author Zhibo Wei <uglytroll@dongxuexidu.com>
 */
public class DoubanCollectionFeed extends DoubanFeed {

    @Key
    private List<DoubanCollection> collections;

    public List<DoubanCollection> getCollections() {
        return collections;
    }

    public void setCollections(List<DoubanCollection> collections) {
        this.collections = collections;
    }

    public void printCollections() {
        if (collections != null) {
            for (DoubanCollection collection : collections) {
                System.out.println(ToStringBuilder.reflectionToString(collection));
            }
        }
    }

}
