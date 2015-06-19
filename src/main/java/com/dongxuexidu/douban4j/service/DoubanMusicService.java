package com.dongxuexidu.douban4j.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by dxu on 6/19/15.
 */
public class DoubanMusicService extends DoubanService {

    private static final Log log = LogFactory.getLog(DoubanMusicService.class);

    public DoubanMusicService() {
        super();
    }

    DoubanMusicService(String accessToken) {
        super(accessToken);
    }


}
