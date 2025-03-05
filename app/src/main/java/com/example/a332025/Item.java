package com.example.a332025;

public class Item {
    private String name , description;
    private int image;
    public Item() {
    }

    public Item(String description, int image, String name) {
        this.description = description;
        this.image = image;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

