/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.triprismdemo;
import javax.swing.*;

class TriPrism<T extends Number> {
    private T length;
    private T base;
    private T height;

    public void setLength(T length) {
        this.length = length;
    }

    public void setBase(T base) {
        this.base = base;
    }

    public void setHeight(T height) {
        this.height = height;
    }

    public T getLength() {
        return length;
    }

    public T getBase() {
        return base;
    }

    public T getHeight() {
        return height;
    }

    public double calculateVolume() {
        double l = length.doubleValue();
        double b = base.doubleValue();
        double h = height.doubleValue();

        return l * (0.5 * b * h);
    }
}

public class TriPrismDemo extends javax.swing.JFrame {

    private TriPrism<Integer> tp1;
    private TriPrism<Double> tp2;

    public TriPrismDemo() {
        initComponents();
        tp1 = new TriPrism<>();
        tp2 = new TriPrism<>();
    }

    private void calculateVolumeBtnActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        try {
            tp1.setLength(Integer.parseInt(tp1LengthField.getText()));
            tp1.setBase(Integer.parseInt(tp1BaseField.getText()));
            tp1.setHeight(Integer.parseInt(tp1HeightField.getText()));

            tp2.setLength(Double.parseDouble(tp2LengthField.getText()));
            tp2.setBase(Double.parseDouble(tp2BaseField.getText()));
            tp2.setHeight(Double.parseDouble(tp2HeightField.getText()));

            double volume1 = tp1.calculateVolume();
            double volume2 = tp2.calculateVolume();

            tp1VolumeLabel.setText("The volume of the triangular prism is " + volume1);
            tp2VolumeLabel.setText("The volume of the triangular prism is " + volume2);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter numeric values.");
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TriPrismDemo().setVisible(true);
            }
        });
    }

    private javax.swing.JButton calculateVolumeBtn;
    private javax.swing.JLabel tp1BaseLabel;
    private javax.swing.JTextField tp1BaseField;
    private javax.swing.JLabel tp1HeightLabel;
    private javax.swing.JTextField tp1HeightField;
    private javax.swing.JLabel tp1LengthLabel;
    private javax.swing.JTextField tp1LengthField;
    private javax.swing.JLabel tp1VolumeLabel;
    private javax.swing.JLabel tp2BaseLabel;
    private javax.swing.JTextField tp2BaseField;
    private javax.swing.JLabel tp2HeightLabel;
    private javax.swing.JTextField tp2HeightField;
    private javax.swing.JLabel tp2LengthLabel;
    private javax.swing.JTextField tp2LengthField;
    private javax.swing.JLabel tp2VolumeLabel;

    private void initComponents() {
        tp1LengthLabel = new javax.swing.JLabel();
        tp1LengthField = new javax.swing.JTextField();
        tp1BaseLabel = new javax.swing.JLabel();
        tp1BaseField = new javax.swing.JTextField();
        tp1HeightLabel = new javax.swing.JLabel();
        tp1HeightField = new javax.swing.JTextField();
        tp1VolumeLabel = new javax.swing.JLabel();
        tp2LengthLabel = new javax.swing.JLabel();
        tp2LengthField = new javax.swing.JTextField();
        tp2BaseLabel = new javax.swing.JLabel();
        tp2BaseField = new javax.swing.JTextField();
        tp2HeightLabel = new javax.swing.JLabel();
        tp2HeightField = new javax.swing.JTextField();
        tp2VolumeLabel = new javax.swing.JLabel();
        calculateVolumeBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Triangular Prism Calculator");

        tp1LengthLabel.setText("Length:");

        tp1BaseLabel.setText("Base:");

        tp1HeightLabel.setText("Height:");

        tp1VolumeLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tp1VolumeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tp1VolumeLabel.setText("The volume of the triangular prism is");

        tp2LengthLabel.setText("Length:");

        tp2BaseLabel.setText("Base:");

        tp2HeightLabel.setText("Height:");

        tp2VolumeLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tp2VolumeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tp2VolumeLabel.setText("The volume of the triangular prism is");

        calculateVolumeBtn.setText("Calculate Volume");
        calculateVolumeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateVolumeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tp1VolumeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tp2VolumeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tp1LengthLabel)
                                    .addComponent(tp1BaseLabel)
                                    .addComponent(tp1HeightLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tp1LengthField, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(tp1BaseField)
                                    .addComponent(tp1HeightField)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tp2LengthLabel)
                                    .addComponent(tp2BaseLabel)
                                    .addComponent(tp2HeightLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tp2LengthField, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(tp2BaseField)
                                    .addComponent(tp2HeightField))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(calculateVolumeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tp1LengthLabel)
                    .addComponent(tp1LengthField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tp1BaseLabel)
                    .addComponent(tp1BaseField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tp1HeightLabel)
                    .addComponent(tp1HeightField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tp1VolumeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tp2LengthLabel)
                    .addComponent(tp2LengthField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tp2BaseLabel)
                    .addComponent(tp2BaseField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tp2HeightLabel)
                    .addComponent(tp2HeightField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tp2VolumeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(calculateVolumeBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }                      

    private void calculateVolumeBtnActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        try {
            tp1.setLength(Integer.parseInt(tp1LengthField.getText()));
            tp1.setBase(Integer.parseInt(tp1BaseField.getText()));
            tp1.setHeight(Integer.parseInt(tp1HeightField.getText()));

            tp2.setLength(Double.parseDouble(tp2LengthField.getText()));
            tp2.setBase(Double.parseDouble(tp2BaseField.getText()));
            tp2.setHeight(Double.parseDouble(tp2HeightField.getText()));

            double volume1 = tp1.calculateVolume();
            double volume2 = tp2.calculateVolume();

            tp1VolumeLabel.setText("The volume of the triangular prism is " + volume1);
            tp2VolumeLabel.setText("The volume of the triangular prism is " + volume2);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter numeric values.");
        }
    }                                                  

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TriPrismDemo().setVisible(true);
            }
        });
    }              

    private javax.swing.JButton calculateVolumeBtn;
    private javax.swing.JTextField tp1BaseField;
    private javax.swing.JLabel tp1BaseLabel;
    private javax.swing.JTextField tp1HeightField;
    private javax.swing.JLabel tp1HeightLabel;
    private javax.swing.JTextField tp1LengthField;
    private javax.swing.JLabel tp1LengthLabel;
    private javax.swing.JLabel tp1VolumeLabel;
    private javax.swing.JTextField tp2BaseField;
    private javax.swing.JLabel tp2BaseLabel;
    private javax.swing.JTextField tp2HeightField;
    private javax.swing.JLabel tp2HeightLabel;
    private javax.swing.JTextField tp2LengthField;
    private javax.swing.JLabel tp2LengthLabel;
    private javax.swing.JLabel tp2VolumeLabel;

}
