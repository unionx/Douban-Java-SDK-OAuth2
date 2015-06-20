package com.dongxuexidu.douban4j.playground;

/**
 * @author unionx
 */

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.awt.*;
import java.net.URI;

public class BrowserLauncher {

    private static final Log log = LogFactory.getLog(BrowserLauncher.class);

    public static void openURL(String url) throws Exception {
        if (Desktop.isDesktopSupported()) {
            log.info("Open url in browser.");
            Desktop.getDesktop().browse(new URI(url));
        } else {
            log.info("No desktop browser.");
        }
    }

}
