package com.dongxuexidu.douban4j.model.music;

import com.dongxuexidu.douban4j.model.IDoubanObject;
import com.dongxuexidu.douban4j.model.subject.SubjectFeed;
import com.google.api.client.util.Key;

/**
 * Created by dxu on 6/19/15.
 */
public class MusicFeed extends SubjectFeed implements IDoubanObject {



    @Override
    public String getObjName() {
        return "MusicFeed";
    }

}
