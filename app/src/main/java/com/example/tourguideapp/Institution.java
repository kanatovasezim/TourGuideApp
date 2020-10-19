package com.example.tourguideapp;

import com.example.tourguideapp.Enum.Category;

public class Institution {
    private String name;
    private String description;
    private String address;
    private String contacts;
    private int imageID;
    private Category category;

    public Institution(String name, String description, String address, String contacts, int imageID, Category category) {
        this.name = name;
        this.description = description;
        this.address = address;
        this.contacts = contacts;
        this.imageID = imageID;
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }
}
