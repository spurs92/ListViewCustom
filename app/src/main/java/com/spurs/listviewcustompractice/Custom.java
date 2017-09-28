package com.spurs.listviewcustompractice;

/**
 * Created by alfo06-11 on 2017-05-24.
 */

public class Custom {
    private int img;
    private String name;
    private String weight;
    private String height;
    private String year;

    public Custom(int img, String name, String weight, String height, String year) {
        this.img = img;
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.year = year;
    }

    public int getImg() {

        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
