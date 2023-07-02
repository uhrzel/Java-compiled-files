/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cardemo;

/**
 *
 * @author User
 */
public class Car {
    private final int year;
    private final Model model;
    private final Color color;

    public Car(int year, Model model, Color color) {
        this.year = year;
        this.model = model;
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public Model getModel() {
        return model;
    }

    public Color getColor() {
        return color;
    }
}

