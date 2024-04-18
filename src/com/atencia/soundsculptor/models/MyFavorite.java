package com.atencia.soundsculptor.models;

public class MyFavorite {

    public void addFavorite(Audio audio) {
        int classification = audio.getClassification();
        String favoriteMessage = "Added to favorites: " + audio.getTitle() + " (";

        if (classification == 5) {
            favoriteMessage += "Top favorite of the moment)!";
        } else if (classification == 4) {
            favoriteMessage += "Another favorite of the moment)!";
        } else if (classification == 3) {
            favoriteMessage += "A great choice)!";
        } else if (classification == 2) {
            favoriteMessage += "Recommended)!";
        } else {
            favoriteMessage += "Rating 1, needs review)!";
        }

        System.out.println(favoriteMessage);
    }

}
