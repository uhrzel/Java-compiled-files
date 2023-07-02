/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cardemo;

/**
 *
 * @author User
 */
import javax.swing.*;

public class CarGUI {
    private final JFrame frame;
    private final JTextArea textArea;

    public CarGUI() {
        frame = new JFrame("Car Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        textArea = new JTextArea();
        textArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(textArea);

        frame.getContentPane().add(scrollPane);

        frame.setVisible(true);
    }

    public void displayCar(Car car) {
        textArea.append("Year: " + car.getYear() + "\n");
        textArea.append("Model: " + car.getModel() + "\n");
        textArea.append("Color: " + car.getColor() + "\n\n");
    }
}

