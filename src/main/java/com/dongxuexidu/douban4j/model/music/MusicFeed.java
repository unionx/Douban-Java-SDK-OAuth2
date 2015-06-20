package com.dongxuexidu.douban4j.model.music;

import com.dongxuexidu.douban4j.model.IDoubanObject;
import com.dongxuexidu.douban4j.model.feed.DoubanFeed;

/**
 * Created by dxu on 6/19/15.
 */
public class MusicFeed extends DoubanFeed implements IDoubanObject {


    @Override
    public String getObjName() {
        return "MusicFeed";
    }

}
