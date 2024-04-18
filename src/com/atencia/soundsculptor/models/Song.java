package com.atencia.soundsculptor.models;

public class Song extends Audio {

    private String album;
    private String singer;
    private String gender;

    @Override
    public int getClassification() {
        if (getTotalLike() >= 5000000) return 5;
        else if (getTotalLike() >= 3000000) return 4;
        else if (getTotalLike() >= 2000000) return 3;
        else if (getTotalLike() >= 500000) return 2;
        else return 1;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
