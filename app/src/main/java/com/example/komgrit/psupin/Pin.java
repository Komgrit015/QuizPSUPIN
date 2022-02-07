package com.example.komgrit.psupin;

/**
 * Created by Komgrit on 15/11/2560.
 */
public class Pin {
    int icon;
    String username;
    String postTime;

    public Pin(int icon, String username, String postTime) {
        this.icon = icon;
        this.username = username;
        this.postTime = postTime;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPostTime() {
        return postTime;
    }

    public void setPostTime(String postTime) {
        this.postTime = postTime;
    }
}