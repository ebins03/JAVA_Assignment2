package com.example.apidemo;

public class APIResponse {
    public int userId;
    public int id;
    public String title;
    public String body;
    public String quote;
    public String author;
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return quote;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getBody() {
        return author;
    }
    public void setBody(String body) {
        this.body = body;
    }
}
