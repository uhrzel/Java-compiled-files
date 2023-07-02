/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.threadgui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ThreadGUI extends JFrame {
    private JLabel threadLabel1, threadLabel2;
    private JTextField threadField1, threadField2;
    private JButton startButton;
    private JTextArea outputArea;

    public ThreadGUI() {
        setTitle("Thread GUI Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new GridLayout(4, 2));

        threadLabel1 = new JLabel("Name your first thread:");
        threadField1 = new JTextField();
        threadLabel2 = new JLabel("Name your second thread:");
        threadField2 = new JTextField();
        startButton = new JButton("Start Threads");
        outputArea = new JTextArea();

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String threadName1 = threadField1.getText();
                String threadName2 = threadField2.getText();

                Thread thread1 = new Thread(new MyRunnable(threadName1));
                Thread thread2 = new Thread(new MyRunnable(threadName2));

                outputArea.append("Starting the threads...\n");

                thread1.start();
                thread2.start();

                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }

                outputArea.append("After sleep...\n");
                outputArea.append(threadName1 + " is " + thread1.getState() + "\n");
                outputArea.append(threadName2 + " is " + thread2.getState() + "\n");
            }
        });

        add(threadLabel1);
        add(threadField1);
        add(threadLabel2);
        add(threadField2);
        add(startButton);
        add(new JLabel()); // Placeholder for grid layout
        add(new JScrollPane(outputArea));

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ThreadGUI();
            }
        });
    }

    private class MyRunnable implements Runnable {
        private String threadName;

        public MyRunnable(String threadName) {
            this.threadName = threadName;
        }

        @Override
        public void run() {
            outputArea.append(threadName + " is " + Thread.currentThread().getState() + "\n");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            outputArea.append(threadName + " is " + Thread.currentThread().getState() + "\n");
        }
    }
}
