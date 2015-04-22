package com.dongxuexidu.douban4j.model.common;

import com.google.api.client.util.Key;

/**
 * Created by unionx on 15/4/22.
 */
public class DoubanSubject {

  @Key
  private String id;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }
}
