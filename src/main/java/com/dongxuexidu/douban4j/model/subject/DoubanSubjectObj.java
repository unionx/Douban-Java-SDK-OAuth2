package com.dongxuexidu.douban4j.model.subject;

import com.dongxuexidu.douban4j.model.IDoubanObject;
import com.dongxuexidu.douban4j.model.common.*;
import com.dongxuexidu.douban4j.model.v2.DoubanCastObject;
import com.dongxuexidu.douban4j.model.v2.DoubanDirectorObj;
import com.dongxuexidu.douban4j.model.v2.DoubanRatingObj;
import com.google.api.client.util.Key;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sean Guo <seanguo85@qq.com>
 */
public class DoubanSubjectObj implements IDoubanObject {

    @Key
    private DoubanRatingObj rating;

    @Key
    private String title;

    @Key
    private String original_title;

    @Key
    private String year;

    @Key
    private DoubanCategoryObj category;

    @Key
    private String subtype;

    @Key
    private DoubanImage images;

    @Key
    private String alt;

    @Key
    private String id;

    @Key
    private String summary;

    @Key
    private List<DoubanTag> tags = new ArrayList<DoubanTag>();

    @Key
    private List<DoubanCastObject> casts = new ArrayList<DoubanCastObject>();

    @Key
    private List<DoubanDirectorObj> directors = new ArrayList<>();

    @Key
    private List<String> aka = new ArrayList<>();

    @Key
    private List<String> genres = new ArrayList<>();

    @Key
    private List<String> countries = new ArrayList<>();

    @Key("db:author")
    private List<DoubanAuthor> authors = new ArrayList<>();

    @Key("db:attribute")
    private List<DoubanAttributeObj> attributes = new ArrayList<>();

    @Key
    private int comments_count;

    @Key
    private int ratings_count;

    @Override
    public String getObjName() {
        return "DoubanSubjectObj";
    }

    public DoubanRatingObj getRating() {
        return rating;
    }

    public String getTitle() {
        return title;
    }

    public String getOriginal_title() {
        return original_title;
    }

    /**
     * @return the category
     */
    public DoubanCategoryObj getCategory() {
        return category;
    }


    public String getYear() {
        return year;
    }

    public String getSubtype() {
        return subtype;
    }

    public DoubanImage getImages() {
        return images;
    }

    public List<DoubanTag> getTags() {
        return tags;
    }

    public void setTags(List<DoubanTag> tags) {
        this.tags = tags;
    }

    public String getAlt() {
        return alt;
    }

    /**
     * @return the authors
     */
    public List<DoubanAuthor> getAuthors() {
        return authors;
    }

    /**
     * @param authors the authors to set
     */
    public void setAuthors(List<DoubanAuthor> authors) {
        this.authors = authors;
    }

    public void addAuthor(DoubanAuthor author) {
        this.authors.add(author);
    }

    /**
     * @return the attributes
     */
    public List<DoubanAttributeObj> getAttributes() {
        return attributes;
    }

    /**
     * @param attribute the attribute to set
     */
    public void addAttribute(DoubanAttributeObj attribute) {
        this.attributes.add(attribute);
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getSummary() {
        return summary;
    }

    public List<DoubanCastObject> getCasts() {
        return casts;
    }

    public List<String> getAka() {
        return aka;
    }

    public int getComments_count() {
        return comments_count;
    }

    public int getRatings_count() {
        return ratings_count;
    }

    public List<String> getGenres() {
        return genres;
    }

    public List<String> getCountries() {
        return countries;
    }

    public List<DoubanDirectorObj> getDirectors() {
        return directors;
    }
}
