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
    
}
