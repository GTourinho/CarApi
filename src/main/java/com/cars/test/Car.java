package com.cars.test;

import org.springframework.data.annotation.Id;

public class Car {
    @Id
    public String id;
    private String title, brand, price, dateTime;
    private int age;

    public Car(String title, String brand, String price, int age) {
        this.title = title;
        this.brand = brand;
        this.price = price;
        this.age = age;
    }
    
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }
}