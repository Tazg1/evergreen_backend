package com.tazgi.evergreen.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "items")
public class Item {

    private String name;
    private String desc;
    private String cost;
    private String img;
    private String type;

    public Item() {

    }

    @Override
    public String toString() {
        return "Post{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", cost='" + cost + '\'' +
                ", img='" + img + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
