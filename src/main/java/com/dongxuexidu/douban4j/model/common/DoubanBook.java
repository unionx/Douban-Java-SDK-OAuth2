package com.dongxuexidu.douban4j.model.common;

import com.dongxuexidu.douban4j.model.IDoubanObject;
import com.google.api.client.util.Key;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by unionx on 15/4/22.
 */
public class DoubanBook extends DoubanSubject implements IDoubanObject {

    @Key
    private String isbn10;

    @Key
    private String isbn13;

    @Key
    private String title;

    @Key("origin_title")
    private String originTitle;

    @Key("alt_title")
    private String altTitle;

    @Key
    private String subtitle;

    @Key
    private String url;

    @Key
    private String alt;

    @Key
    private String image;

    @Key
    private DoubanImage images;

    @Key("author")
    private List<String> authors = new ArrayList<>();

    @Key("translator")
    private List<String> translators = new ArrayList<>();

    @Key
    private String publisher;

    // TODO: use joda-time
    @Key
    private String pubdate;

    @Key
    private DoubanRating rating;

    @Key
    private List<DoubanTag> tags = new ArrayList<>();

    @Key
    private String binding;

    @Key
    private String price;

    @Key
    private DoubanSeries series;

    @Key
    private String pages;

    @Key("author_intro")
    private String authorIntro;

    @Key
    private String summary;

    @Key
    private String catalog;

    @Key("ebook_url")
    private String ebookUrl;

    @Key("ebook_price")
    private String ebookPrice;

    @Override
    public String getObjName() {
        return "book";
    }

    public String getIsbn10() {
        return isbn10;
    }

    public void setIsbn10(String isbn10) {
        this.isbn10 = isbn10;
    }

    public String getIsbn13() {
        return isbn13;
    }

    public void setIsbn13(String isbn13) {
        this.isbn13 = isbn13;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOriginTitle() {
        return originTitle;
    }

    public void setOriginTitle(String originTitle) {
        this.originTitle = originTitle;
    }

    public String getAltTitle() {
        return altTitle;
    }

    public void setAltTitle(String altTitle) {
        this.altTitle = altTitle;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public DoubanImage getImages() {
        return images;
    }

    public void setImages(DoubanImage images) {
        this.images = images;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public List<String> getTranslators() {
        return translators;
    }

    public void setTranslators(List<String> translators) {
        this.translators = translators;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPubdate() {
        return pubdate;
    }

    public void setPubdate(String pubdate) {
        this.pubdate = pubdate;
    }

    public DoubanRating getRating() {
        return rating;
    }

    public void setRating(DoubanRating rating) {
        this.rating = rating;
    }

    public List<DoubanTag> getTags() {
        return tags;
    }

    public void setTags(List<DoubanTag> tags) {
        this.tags = tags;
    }

    public String getBinding() {
        return binding;
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public DoubanSeries getSeries() {
        return series;
    }

    public void setSeries(DoubanSeries series) {
        this.series = series;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public String getAuthorIntro() {
        return authorIntro;
    }

    public void setAuthorIntro(String authorIntro) {
        this.authorIntro = authorIntro;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    public String getEbookUrl() {
        return ebookUrl;
    }

    public void setEbookUrl(String ebookUrl) {
        this.ebookUrl = ebookUrl;
    }

    public String getEbookPrice() {
        return ebookPrice;
    }

    public void setEbookPrice(String ebookPrice) {
        this.ebookPrice = ebookPrice;
    }
}
