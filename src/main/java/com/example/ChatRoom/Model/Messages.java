package com.example.ChatRoom.Model;

public class Messages {
    private String name;
    private String content;

    public Messages(String name, String content) {
        this.name = name;
        this.content = content;
    }

    public Messages() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
