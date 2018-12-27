package com.example.muhammad.customlistview.model;

public class RowData {

    private String title,description,version;
    private int images;

    public RowData(String title, String description, String version, int images) {
        this.title = title;
        this.description = description;
        this.version = version;
        this.images = images;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }
}
