package com.dongxuexidu.douban4j.constants;

import com.google.api.client.xml.XmlNamespaceDictionary;

/**
 * @author Zhibo Wei <uglytroll@dongxuexidu.com>
 */
public class DefaultConfigs {

    public static final String API_KEY = "";
    public static final String SECRET_KEY = "";
    public static final String API_URL_PREFIX = "https://api.douban.com/v2";
    public static final String AUTH_URL = "https://www.douban.com/service/auth2/auth";
    public static final String ACCESS_TOKEN_URL = "https://www.douban.com/service/auth2/token";
    public static final String ACCESS_TOKEN_REDIRECT_URL = "http://www.dongxuexidu.com";
    public static String TEST_API_KEY = null;


    public static final XmlNamespaceDictionary DOUBAN_XML_NAMESPACE = new XmlNamespaceDictionary()
            .set("", "http://www.w3.org/2005/Atom")
            .set("db", "http://www.douban.com/xmlns/")
            .set("gd", "http://schemas.google.com/g/2005")
            .set("opensearch", "http://a9.com/-/spec/opensearchrss/1.0/");

    public static void setTestApiKey(String apiKey) {
        TEST_API_KEY = apiKey;
    }

}
