package com.example.studio111.commentist;

/**
 * Created by rsteller on 1/13/2017.
 */

public class Show {
    String name;
    String description;
    int image;

    public Show(String name, String description, int image){
        this.name = name;
        this.description = description;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }


}
