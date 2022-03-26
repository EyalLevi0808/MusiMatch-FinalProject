package com.example.musimatch.models;

import androidx.room.Entity;

import java.io.Serializable;

@Entity
public class Post implements Serializable {
    private String id;
    private String title;
    private String poemLyrics;
    private String melodyFilePath;
    private String uploaderId;
    private PostType postType;
    private Double averagePostRate;
    private String[] linkedPostsIds;
    private String[] commentsIds;
    private String[] tags;
    // TODO: ADD SerialRater[] serialRaters;

    public Post() { }

    public Post(String id, String title, String poemLyrics, String melodyFilePath, String uploaderId,
                PostType postType, Double averagePostRate, String[] linkedPostsIds, String[] commentsIds,
                String[] tags) {
        this.id = id;
        this.title = title;
        this.poemLyrics = poemLyrics;
        this.melodyFilePath = melodyFilePath;
        this.uploaderId = uploaderId;
        this.postType = postType;
        this.averagePostRate = averagePostRate;
        this.linkedPostsIds = linkedPostsIds;
        this.commentsIds = commentsIds;
        this.tags = tags;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPoemLyrics() {
        return poemLyrics;
    }

    public void setPoemLyrics(String poemLyrics) {
        this.poemLyrics = poemLyrics;
    }

    public String getMelodyFilePath() {
        return melodyFilePath;
    }

    public void setMelodyFilePath(String melodyFilePath) {
        this.melodyFilePath = melodyFilePath;
    }

    public PostType getPostType() {
        return postType;
    }

    public void setPostType(PostType postType) {
        this.postType = postType;
    }

    public String getUploaderId() {
        return uploaderId;
    }

    public void setUploaderId(String uploaderId) {
        this.uploaderId = uploaderId;
    }

    public String[] getLinkedPostsIds() {
        return linkedPostsIds;
    }

    public void setLinkedPostsIds(String[] linkedPostsIds) {
        this.linkedPostsIds = linkedPostsIds;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public Double getAveragePostRate() {
        return averagePostRate;
    }

    public void setAveragePostRate(Double averagePostRate) {
        this.averagePostRate = averagePostRate;
    }

    public String[] getCommentsIds() {
        return commentsIds;
    }

    public void setCommentsIds(String[] commentsIds) {
        this.commentsIds = commentsIds;
    }
}