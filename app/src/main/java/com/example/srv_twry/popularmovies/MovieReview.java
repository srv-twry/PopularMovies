package com.example.srv_twry.popularmovies;

/**
 * Created by srv_twry on 1/6/17.
 * A Java class to represent a single movie review
 */

public class MovieReview {
    private String author;
    private String content;
    private String reviewUrl;

    public MovieReview(String author, String content , String reviewUrl){
        this.author=author;
        this.content=content;
        this.reviewUrl=reviewUrl;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public String getReviewUrl() {
        return reviewUrl;
    }
}
