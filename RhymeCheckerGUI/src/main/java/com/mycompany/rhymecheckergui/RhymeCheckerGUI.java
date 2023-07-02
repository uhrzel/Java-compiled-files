/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.rhymecheckergui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RhymeCheckerGUI extends JFrame {
    private JTextField word1TextField;
    private JTextField word2TextField;
    private JLabel resultLabel;

    public RhymeCheckerGUI() {
        setTitle("Rhyme Checker");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 2));

        JLabel word1Label = new JLabel("Enter the first word:");
        word1TextField = new JTextField();
        JLabel word2Label = new JLabel("Enter the second word:");
        word2TextField = new JTextField();
        JButton checkButton = new JButton("Check");
        resultLabel = new JLabel("");

        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String word1 = word1TextField.getText();
                String word2 = word2TextField.getText();
                String sub = word1.substring(word1.length() - 2);

                Pattern pattern = Pattern.compile("[a-zA-Z]{1,2}" + sub, Pattern.CASE_INSENSITIVE);
                Matcher matcher = pattern.matcher(word2);

                if (matcher.matches()) {
                    resultLabel.setText(word2 + " rhymes with " + word1);
                } else {
                    resultLabel.setText("I'm not sure! Sorry!");
                }
            }
        });

        add(word1Label);
        add(word1TextField);
        add(word2Label);
        add(word2TextField);
        add(checkButton);
        add(new JLabel()); // Empty label for spacing
        add(new JLabel("Result:"));
        add(resultLabel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                RhymeCheckerGUI gui = new RhymeCheckerGUI();
                gui.setVisible(true);
            }
        });
    }
}

