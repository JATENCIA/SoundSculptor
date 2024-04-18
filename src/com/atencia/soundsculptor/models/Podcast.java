package com.atencia.soundsculptor.models;

public class Podcast extends Audio {

    private String presenter;
    private String description;

    @Override
    public int getClassification() {
        if (getTotalPlayback() >= 3000000) return 5;
        else if (getTotalPlayback() >= 2000000) return 4;
        else if (getTotalPlayback() >= 1000000) return 3;
        else if (getTotalPlayback() >= 2000) return 2;
        else return 1;
    }

    public String getPresenter() {
        return presenter;
    }

    public void setPresenter(String presenter) {
        this.presenter = presenter;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
