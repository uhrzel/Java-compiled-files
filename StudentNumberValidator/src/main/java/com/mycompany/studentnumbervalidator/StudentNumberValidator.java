/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.studentnumbervalidator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StudentNumberValidator extends JFrame {
    private JTextField studentNumberTextField;
    private JLabel resultLabel;
    private JLabel welcomeLabel;

    public StudentNumberValidator() {
        setTitle("Student Number Validator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 250);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 2));

        JLabel studentNumberLabel = new JLabel("Enter your student number:");
        studentNumberTextField = new JTextField();
        JButton checkButton = new JButton("Check");
        resultLabel = new JLabel("");
        welcomeLabel = new JLabel("");

        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String studentNumber = studentNumberTextField.getText();

                Pattern pattern = Pattern.compile("\\d{4}-\\d{2}-\\d{3}");
                Matcher matcher = pattern.matcher(studentNumber);

                if (matcher.matches()) {
                    resultLabel.setText("You have successfully logged in");
                    welcomeLabel.setText("Welcome to your new dashboard");
                } else {
                    resultLabel.setText("Invalid student number format");
                    welcomeLabel.setText("");
                }
            }
        });

        add(studentNumberLabel);
        add(studentNumberTextField);
        add(checkButton);
        add(new JLabel()); // Empty label for spacing
        add(new JLabel("Result:"));
        add(resultLabel);
        add(new JLabel()); // Empty label for spacing
        add(welcomeLabel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                StudentNumberValidator gui = new StudentNumberValidator();
                gui.setVisible(true);
            }
        });
    }
}
