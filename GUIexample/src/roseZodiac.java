import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class roseZodiac extends JFrame {
    private JTextField dayTextField;
    private JTextField monthTextField;
    private JLabel resultLabel;

    private final Map<String, Integer> monthMap = new HashMap<>();

    public roseZodiac() {
        setTitle("Zodiac Sign Calculator");
        setSize(500, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JPanel panel = new JPanel();

        JLabel dayLabel = new JLabel("Day:");
        panel.add(dayLabel);

        dayTextField = new JTextField();
        dayTextField.setColumns(10);
        panel.add(dayTextField);

        JLabel monthLabel = new JLabel("Month:");
        panel.add(monthLabel);

        monthTextField = new JTextField();
        monthTextField.setColumns(10);
        panel.add(monthTextField);

        add(panel);
        setBackgroundImage("b.jpg");
        JButton calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(new CalculateButtonListener());
        add(calculateButton);

        resultLabel = new JLabel("Your Zodiac Sign:");
        add(resultLabel);

        JButton backButton = new JButton("Back");
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                GUIexample guiExample = new GUIexample();
                guiExample.createAndShowGUI();
            }
        });
        add(backButton);

        initializeMonthMap();
    }
    private void setBackgroundImage(String imagePath) {
        ImageIcon backgroundImage = new ImageIcon(imagePath);
        Image img = backgroundImage.getImage();
        Image resizedImg = img.getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH);
        ImageIcon resizedBackgroundImage = new ImageIcon(resizedImg);

        JLabel backgroundLabel = new JLabel(resizedBackgroundImage);
        backgroundLabel.setBounds(0, 0, getWidth(), getHeight());
        ((JPanel) getContentPane()).setOpaque(false);
        getLayeredPane().add(backgroundLabel, Integer.valueOf(Integer.MIN_VALUE));
    }


    private void initializeMonthMap() {
        monthMap.put("january", 1);
        monthMap.put("february", 2);
        monthMap.put("march", 3);
        monthMap.put("april", 4);
        monthMap.put("may", 5);
        monthMap.put("june", 6);
        monthMap.put("july", 7);
        monthMap.put("august", 8);
        monthMap.put("september", 9);
        monthMap.put("october", 10);
        monthMap.put("november", 11);
        monthMap.put("december", 12);
    }

    private class CalculateButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int day = Integer.parseInt(dayTextField.getText());
            String monthString = monthTextField.getText().toLowerCase();

            Integer month = null;
            try {
                month = Integer.parseInt(monthString);
            } catch (NumberFormatException ex) {
                // Ignore the exception, will try to match the monthString with predefined month names
            }

            if (month == null) {
                month = monthMap.get(monthString);
            }

            if (month == null) {
                resultLabel.setText("Invalid Month");
                return;
            }

            String zodiacSign = calculateZodiacSign(day, month);
            resultLabel.setText("Your Zodiac Sign: " + zodiacSign);
        }
    }

    private String calculateZodiacSign(int day, int month) {
        switch (month) {
            case 1:
                if (day >= 20) {
                    return "Aquarius";
                } else {
                    return "Capricorn";
                }
            case 2:
                if (day >= 19) {
                    return "Pisces";
                } else {
                    return "Aquarius";
                }
            case 3:
                if (day >= 21) {
                    return "Aries";
                } else {
                    return "Pisces";
                }
            case 4:
                if (day >= 20) {
                    return "Taurus";
                } else {
                    return "Aries";
                }
            case 5:
                if (day >= 21) {
                    return "Gemini";
                } else {
                    return "Taurus";
                }
            case 6:
                if (day >= 21) {
                    return "Cancer";
                } else {
                    return "Gemini";
                }
            case 7:
                if (day >= 23) {
                    return "Leo";
                } else {
                    return "Cancer";
                }
            case 8:
                if (day >= 23) {
                    return "Virgo";
                } else {
                    return "Leo";
                }
            case 9:
                if (day >= 23) {
                    return "Libra";
                } else {
                    return "Virgo";
                }
            case 10:
                if (day >= 23) {
                    return "Scorpio";
                } else {
                    return "Libra";
                }
            case 11:
                if (day >= 22) {
                    return "Sagittarius";
                } else {
                    return "Scorpio";
                }
            case 12:
                if (day >= 22) {
                    return "Capricorn";
                } else {
                    return "Sagittarius";
                }
            default:
                return "Invalid Date";
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            roseZodiac calculatorGUI = new roseZodiac();
            calculatorGUI.setVisible(true);
        });
    }
}
