package com.atencia.soundsculptor.models;

public class Audio {

    private String title;
    private int totalPlayback;
    private int totalLike;
    private int classification;


    public void likes() {
        this.totalLike++;
    }

    public void playback() {
        this.totalPlayback++;
    }

    public String getTitle() {
        return title;
    }

    public int getTotalPlayback() {
        return totalPlayback;
    }

    public int getTotalLike() {
        return totalLike;
    }

    public int getClassification() {
        return classification;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setClassification(int classification) {
        this.classification = classification;
    }
}
