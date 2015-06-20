package com.dongxuexidu.douban4j.model.music;

import com.dongxuexidu.douban4j.model.IDoubanObject;
import com.dongxuexidu.douban4j.model.search.DoubanSearchResult;

/**
 * Created by dxu on 6/19/15.
 */
public class MusicFeed extends DoubanSearchResult implements IDoubanObject {


    @Override
    public String getObjName() {
        return "MusicFeed";
    }

}
