package com.greenfox.retake.exam.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "warehouse")
public class Product {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "item_name")
    private String name;

    @Column(name  = "manufacturer")
    private String manufacturer;

    @Column(name = "category")
    private String category;

    @Column(name = "size")
    private String size;

    @Column(name = "unit_price")
    private float price;

    public Product() {
    }

    public Product(int id, String name, String manufacturer, String category, String size, float price) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.category = category;
        this.size = size;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
