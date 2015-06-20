package com.dongxuexidu.douban4j.service;

import com.dongxuexidu.douban4j.model.app.RequestGrantScope;
import com.dongxuexidu.douban4j.playground.BrowserLauncher;
import com.dongxuexidu.douban4j.provider.OAuthDoubanProvider;
import junit.framework.TestCase;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by unionx on 15/6/20.
 * Test basic OAuth functions.
 */

public class DoubanOAuthTest extends TestCase {

    private static final Log log = LogFactory.getLog(DoubanOAuthTest.class);

    public void testOAuthInit() throws Exception {
        OAuthDoubanProvider provider = new OAuthDoubanProvider();
        provider.setApiKey("0ba4e3363b4682bb22eea9a2b1d38831").setSecretKey("b4f50ef127ac8de7");
        provider.setRedirectUrl("http://localhost:8888");

        provider.addScope(RequestGrantScope.SCOPE_BASIC_COMMON)
                .addScope(RequestGrantScope.SCOPE_BOOK_READ)
                .addScope(RequestGrantScope.SCOPE_BOOK_WRITE);

        BrowserLauncher.openURL(provider.getGetCodeRedirectUrl());
    }

    public void testOpenURL() throws Exception {
        BrowserLauncher.openURL("http://cn.bing.com");
    }

}
