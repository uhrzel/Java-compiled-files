/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.triprismdemogui;

import javax.swing.*;

class TriPrism<T extends Number> {
    private T length;
    private T base;
    private T height;

    public T getLength() {
        return length;
    }

    public void setLength(T length) {
        this.length = length;
    }

    public T getBase() {
        return base;
    }

    public void setBase(T base) {
        this.base = base;
    }

    public T getHeight() {
        return height;
    }

    public void setHeight(T height) {
        this.height = height;
    }

    public double calculateVolume() {
        double lengthValue = length.doubleValue();
        double baseValue = base.doubleValue();
        double heightValue = height.doubleValue();

        return lengthValue * (0.5 * baseValue * heightValue);
    }
}

class TriPrismDemoGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Triangular Prism Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(null);

        JLabel prism1Label = new JLabel("Triangular Prism 1");
        prism1Label.setBounds(10, 10, 150, 20);
        frame.add(prism1Label);

        JLabel lengthLabel1 = new JLabel("Length:");
        lengthLabel1.setBounds(10, 40, 80, 20);
        frame.add(lengthLabel1);

        JTextField lengthField1 = new JTextField();
        lengthField1.setBounds(100, 40, 100, 20);
        frame.add(lengthField1);

        JLabel baseLabel1 = new JLabel("Base:");
        baseLabel1.setBounds(10, 70, 80, 20);
        frame.add(baseLabel1);

        JTextField baseField1 = new JTextField();
        baseField1.setBounds(100, 70, 100, 20);
        frame.add(baseField1);

        JLabel heightLabel1 = new JLabel("Height:");
        heightLabel1.setBounds(10, 100, 80, 20);
        frame.add(heightLabel1);

        JTextField heightField1 = new JTextField();
        heightField1.setBounds(100, 100, 100, 20);
        frame.add(heightField1);

        JButton calculateButton1 = new JButton("Calculate Volume");
        calculateButton1.setBounds(10, 130, 150, 20);
        frame.add(calculateButton1);

        JLabel resultLabel1 = new JLabel();
        resultLabel1.setBounds(10, 160, 200, 20);
        frame.add(resultLabel1);

        JLabel prism2Label = new JLabel("Triangular Prism 2");
        prism2Label.setBounds(220, 10, 150, 20);
        frame.add(prism2Label);

        JLabel lengthLabel2 = new JLabel("Length:");
        lengthLabel2.setBounds(220, 40, 80, 20);
        frame.add(lengthLabel2);

        JTextField lengthField2 = new JTextField();
        lengthField2.setBounds(310, 40, 100, 20);
        frame.add(lengthField2);

        JLabel baseLabel2 = new JLabel("Base:");
        baseLabel2.setBounds(220, 70, 80, 20);
        frame.add(baseLabel2);

        JTextField baseField2 = new JTextField();
        baseField2.setBounds(310, 70, 100, 20);
        frame.add(baseField2);

        JLabel heightLabel2 = new JLabel("Height:");
        heightLabel2.setBounds(220, 100, 80, 20);
        frame.add(heightLabel2);

        JTextField heightField2 = new JTextField();
        heightField2.setBounds(310, 100, 100, 20);
        frame.add(heightField2);

        JButton calculateButton2 = new JButton("Calculate Volume");
        calculateButton2.setBounds(220, 130, 150, 20);
        frame.add(calculateButton2);

        JLabel resultLabel2 = new JLabel();
        resultLabel2.setBounds(220, 160, 200, 20);
        frame.add(resultLabel2);

        calculateButton1.addActionListener(e -> {
            double length1 = Double.parseDouble(lengthField1.getText());
            double base1 = Double.parseDouble(baseField1.getText());
            double height1 = Double.parseDouble(heightField1.getText());

            TriPrism<Double> tp1 = new TriPrism<>();
            tp1.setLength(length1);
            tp1.setBase(base1);
            tp1.setHeight(height1);

            double volume1 = tp1.calculateVolume();
            resultLabel1.setText("Volume: " + volume1);
        });

        calculateButton2.addActionListener(e -> {
            double length2 = Double.parseDouble(lengthField2.getText());
            double base2 = Double.parseDouble(baseField2.getText());
            double height2 = Double.parseDouble(heightField2.getText());

            TriPrism<Double> tp2 = new TriPrism<>();
            tp2.setLength(length2);
            tp2.setBase(base2);
            tp2.setHeight(height2);

            double volume2 = tp2.calculateVolume();
            resultLabel2.setText("Volume: " + volume2);
        });

        frame.setVisible(true);
    }
}


