package com.dongxuexidu.douban4j.model.v2;

import com.dongxuexidu.douban4j.model.IDoubanObject;
import com.google.api.client.util.Key;

/**
 * 
 * @author Sean Guo <seanguo85@qq.com>
 *
 */
public class DoubanRatingObj implements IDoubanObject {
  
  @Key
  private int max;
  
  @Key
  private float average;
  
  @Key
  private int stars;
  
  @Key
  private int min;

  @Key
  private int value;

  @Key("@numRaters")
  private int numberOfRaters = 0;

  @Override
  public String getObjName() {
    return "DoubanRating";
  }

  public int getMax() {
    return max;
  }

  public float getAverage() {
    return average;
  }

  public int getStars() {
    return stars;
  }

  public int getMin() {
    return min;
  }

  /**
   * @return the value
   */
  public int getValue() {
    return value;
  }

  /**
   * @return the numberOfRaters
   */
  public int getNumberOfRaters() {
    return numberOfRaters;
  }

  /**
   * @param numberOfRaters the numberOfRaters to set
   */
  public void setNumberOfRaters(int numberOfRaters) {
    this.numberOfRaters = numberOfRaters;
  }

  @Override
  public String toString() {
    return "DoubanRating [max=" + max + ", average=" + average + ", stars=" + stars + ", min=" + min + "]";
  }
}
