package com.example.phonefullstack.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int phone_id;
    private String color;
    private String processor;
    private String camera;
    private String battery;

    public Phone() {
    }

    public int getPhone_id() {
        return phone_id;
    }

    public void setPhone_id(int id) {
        this.phone_id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + phone_id +
                ", color='" + color + '\'' +
                ", processor='" + processor + '\'' +
                ", camera='" + camera + '\'' +
                ", battery='" + battery + '\'' +
                '}';
    }
}
