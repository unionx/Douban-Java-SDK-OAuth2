package com.dongxuexidu.douban4j.utils;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by unionx on 15/6/20.
 * Helper for create http request.
 */
public class HttpParamHelper {

    private List<NameValuePair> params;

    public HttpParamHelper() {
        params = new ArrayList<>();
    }

    public HttpParamHelper(List<NameValuePair> params) {
        this.params = params;
    }

    public HttpParamHelper addParamPair(String name, String value) {
        params.add(new BasicNameValuePair(name, value));
        return this;
    }

    public List<NameValuePair> getParams() {
        return params;
    }

    public static List<NameValuePair> buildParams(Object... args) {
        List<NameValuePair> params = new ArrayList<>();

        if (args.length % 2 != 0) {
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < args.length; i+=2) {
            if (args[i+1] != null) {
                params.add(new BasicNameValuePair(args[i].toString(),args[i+1].toString()));
            }
        }
        return params;
    }
}
