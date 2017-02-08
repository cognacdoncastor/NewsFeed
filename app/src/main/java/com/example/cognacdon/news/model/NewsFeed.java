package com.example.cognacdon.news.model;

/**
 * Created by Cognac Don on 2/8/2017.
 */

public class NewsFeed {
    private String title;
    private String section;
    private String url;

    public NewsFeed() {
    }

    public NewsFeed(String title, String section, String url) {
        this.title = title;
        this.section = section;
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
