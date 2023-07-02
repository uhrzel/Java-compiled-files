/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cardemo;
import javax.swing.*;

public class CarDemo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Car car1 = new Car(2014, Model.SUV, Color.RED);
            Car car2 = new Car(2020, Model.CONVERTIBLE, Color.BLUE);

            CarGUI carGUI = new CarGUI();
            carGUI.displayCar(car1);
            carGUI.displayCar(car2);
        });
    }
}



