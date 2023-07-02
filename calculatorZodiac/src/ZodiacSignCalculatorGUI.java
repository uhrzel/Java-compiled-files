import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ZodiacSignCalculatorGUI extends JFrame {
    private JTextField dayTextField;
    private JTextField monthTextField;
    private JLabel resultLabel;

    public ZodiacSignCalculatorGUI() {
        setTitle("Zodiac Sign Calculator");
        setSize(300, 200);
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

        JButton calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(new CalculateButtonListener());
        add(calculateButton);

        resultLabel = new JLabel("Your Zodiac Sign:");
        add(resultLabel);
    }

    private class CalculateButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int day = Integer.parseInt(dayTextField.getText());
            int month = Integer.parseInt(monthTextField.getText());

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
            ZodiacSignCalculatorGUI calculatorGUI = new ZodiacSignCalculatorGUI();
            calculatorGUI.setVisible(true);
        });
    }
}
