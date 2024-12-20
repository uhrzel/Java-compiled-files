import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class CurrencyCalculatorMain {
    private JFrame frame;
    private JComboBox<String> fromComboBox;
    private JComboBox<String> toComboBox;
    private JTextField amountField;
    private JLabel resultLabel;

    public void createAndShowGUI() {
        frame = new JFrame("Currency Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 600);

        String imagePath = "b.jpg"; // Path to your background image
        File imageFile = new File(imagePath);
        if (imageFile.exists()) {
            ImageIcon backgroundImage = new ImageIcon(imagePath);
            Image img = backgroundImage.getImage();
            Image resizedImg = img.getScaledInstance(500, 600, Image.SCALE_SMOOTH);
            ImageIcon resizedBackgroundImage = new ImageIcon(resizedImg);
            
            JLabel backgroundLabel = new JLabel(resizedBackgroundImage);
            backgroundLabel.setBounds(0, 0, 500, 600); // Set the size of the label to match the frame size
            ((JPanel) frame.getContentPane()).setOpaque(false);
            frame.getLayeredPane().add(backgroundLabel, Integer.valueOf(Integer.MIN_VALUE));
        }

        

        frame.setLayout(new FlowLayout());

        JPanel fromPanel = createCurrencySelectionPanel("From: ", fromComboBox = new JComboBox<>());
        JPanel toPanel = createCurrencySelectionPanel("To: ", toComboBox = new JComboBox<>());

        JPanel amountPanel = new JPanel(new FlowLayout());
        amountPanel.add(new JLabel("Amount: "));
        amountField = new JTextField(10);
        amountPanel.add(amountField);

        JPanel resultPanel = new JPanel(new FlowLayout());
        resultLabel = new JLabel();
        resultPanel.add(new JLabel("Result: "));
        resultPanel.add(resultLabel);

        JButton convertButton = new JButton("Convert");
        convertButton.addActionListener(new ConvertButtonListener());

        JButton backButton = new JButton("Back");
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                GUIexample guiExample = new GUIexample();
                guiExample.createAndShowGUI();
            }
        });

        frame.getContentPane().add(fromPanel);
        frame.getContentPane().add(toPanel);
        frame.getContentPane().add(amountPanel);
        frame.getContentPane().add(convertButton);
        frame.getContentPane().add(resultPanel);
        frame.getContentPane().add(backButton);

        frame.setVisible(true);
    }

    private JPanel createCurrencySelectionPanel(String label, JComboBox<String> comboBox) {
        JPanel panel = new JPanel(new FlowLayout());
        panel.add(new JLabel(label));
        panel.add(comboBox);
        comboBox.addItem("USD");
        comboBox.addItem("EUR");
        comboBox.addItem("GBP");
        comboBox.addItem("JPY");
        comboBox.addItem("PHP");
        comboBox.addItem("INR");
        comboBox.addItem("AED");
        comboBox.addItem("KRW");
        return panel;
    }

    private class ConvertButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String fromCurrency = (String) fromComboBox.getSelectedItem();
            String toCurrency = (String) toComboBox.getSelectedItem();
            String amountText = amountField.getText();

            if (amountText.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Please enter an amount.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            double amount;
            try {
                amount = Double.parseDouble(amountText);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Invalid amount format. Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            double result = convertCurrency(fromCurrency, toCurrency, amount);
            resultLabel.setText(String.format("%.2f %s", result, toCurrency));
        }

        private double convertCurrency(String fromCurrency, String toCurrency, double amount) {
        	if (fromCurrency.equals("USD") && toCurrency.equals("EUR")) {
                return amount * 0.92;
            } else if (fromCurrency.equals("USD") && toCurrency.equals("GBP")) {
                return amount * 0.80;
            } else if (fromCurrency.equals("USD") && toCurrency.equals("JPY")) {
                return amount * 137.96;
            } else if (fromCurrency.equals("USD") && toCurrency.equals("PHP")) {
                return amount * 55.65;
            } else if (fromCurrency.equals("USD") && toCurrency.equals("AED")) {
                return amount * 3.67;
            } else if (fromCurrency.equals("USD") && toCurrency.equals("INR")) {
                return amount * 82.91;
            } else if (fromCurrency.equals("USD") && toCurrency.equals("KRW")) {
                return amount * 1130.45;
            } else if (fromCurrency.equals("EUR") && toCurrency.equals("USD")) {
                return amount * 1.09;
            } else if (fromCurrency.equals("EUR") && toCurrency.equals("GBP")) {
                return amount * 0.86;
            } else if (fromCurrency.equals("EUR") && toCurrency.equals("JPY")) {
                return amount * 148.15;
            } else if (fromCurrency.equals("EUR") && toCurrency.equals("PHP")) {
                return amount * 59.81;
            } else if (fromCurrency.equals("EUR") && toCurrency.equals("AED")) {
                return amount * 3.95;
            } else if (fromCurrency.equals("EUR") && toCurrency.equals("INR")) {
                return amount * 88.83;
            } else if (fromCurrency.equals("EUR") && toCurrency.equals("KRW")) {
                return amount * 1213.78;
            } else if (fromCurrency.equals("GBP") && toCurrency.equals("USD")) {
                return amount * 1.25;
            } else if (fromCurrency.equals("GBP") && toCurrency.equals("EUR")) {
                return amount * 1.17;
            } else if (fromCurrency.equals("GBP") && toCurrency.equals("JPY")) {
                return amount * 171.80;
            } else if (fromCurrency.equals("GBP") && toCurrency.equals("PHP")) {
                return amount * 69.20;
            } else if (fromCurrency.equals("GBP") && toCurrency.equals("AED")) {
                return amount * 4.57;
            } else if (fromCurrency.equals("GBP") && toCurrency.equals("INR")) {
                return amount * 102.42;
            } else if (fromCurrency.equals("GBP") && toCurrency.equals("KRW")) {
                return amount * 1402.22;
            } else if (fromCurrency.equals("JPY") && toCurrency.equals("USD")) {
                return amount * 0.0073;
            } else if (fromCurrency.equals("JPY") && toCurrency.equals("EUR")) {
                return amount * 0.0068;
            } else if (fromCurrency.equals("JPY") && toCurrency.equals("GBP")) {
                return amount * 0.0058;
            } else if (fromCurrency.equals("JPY") && toCurrency.equals("PHP")) {
                return amount * 0.40;
            } else if (fromCurrency.equals("JPY") && toCurrency.equals("AED")) {
                return amount * 0.027;
            } else if (fromCurrency.equals("JPY") && toCurrency.equals("INR")) {
                return amount * 0.62;
            } else if (fromCurrency.equals("JPY") && toCurrency.equals("KRW")) {
                return amount * 8.53;
            } else if (fromCurrency.equals("PHP") && toCurrency.equals("USD")) {
                return amount * 0.018;
            } else if (fromCurrency.equals("PHP") && toCurrency.equals("EUR")) {
                return amount * 0.017;
            } else if (fromCurrency.equals("PHP") && toCurrency.equals("GBP")) {
                return amount * 0.014;
            } else if (fromCurrency.equals("PHP") && toCurrency.equals("JPY")) {
                return amount * 2.48;
            } else if (fromCurrency.equals("PHP") && toCurrency.equals("AED")) {
                return amount * 0.066;
            } else if (fromCurrency.equals("PHP") && toCurrency.equals("INR")) {
                return amount * 1.48;
            } else if (fromCurrency.equals("PHP") && toCurrency.equals("KRW")) {
                return amount * 20.36;
            } else if (fromCurrency.equals("AED") && toCurrency.equals("USD")) {
                return amount * 0.27;
            } else if (fromCurrency.equals("AED") && toCurrency.equals("EUR")) {
                return amount * 0.25;
            } else if (fromCurrency.equals("AED") && toCurrency.equals("GBP")) {
                return amount * 0.22;
            } else if (fromCurrency.equals("AED") && toCurrency.equals("JPY")) {
                return amount * 36.85;
            } else if (fromCurrency.equals("AED") && toCurrency.equals("PHP")) {
                return amount * 15.11;
            } else if (fromCurrency.equals("AED") && toCurrency.equals("INR")) {
                return amount * 20.58;
            } else if (fromCurrency.equals("AED") && toCurrency.equals("KRW")) {
                return amount * 281.69;
            } else if (fromCurrency.equals("INR") && toCurrency.equals("USD")) {
                return amount * 0.012;
            } else if (fromCurrency.equals("INR") && toCurrency.equals("EUR")) {
                return amount * 0.011;
            } else if (fromCurrency.equals("INR") && toCurrency.equals("GBP")) {
                return amount * 0.0097;
            } else if (fromCurrency.equals("INR") && toCurrency.equals("JPY")) {
                return amount * 1.61;
            } else if (fromCurrency.equals("INR") && toCurrency.equals("PHP")) {
                return amount * 0.68;
            } else if (fromCurrency.equals("INR") && toCurrency.equals("AED")) {
                return amount * 0.049;
            } else if (fromCurrency.equals("INR") && toCurrency.equals("KRW")) {
                return amount * 13.73;
            } else if (fromCurrency.equals("KRW") && toCurrency.equals("USD")) {
                return amount * 0.00088;
            } else if (fromCurrency.equals("KRW") && toCurrency.equals("EUR")) {
                return amount * 0.00082;
            } else if (fromCurrency.equals("KRW") && toCurrency.equals("GBP")) {
                return amount * 0.00071;
            } else if (fromCurrency.equals("KRW") && toCurrency.equals("JPY")) {
                return amount * 0.12;
            } else if (fromCurrency.equals("KRW") && toCurrency.equals("PHP")) {
                return amount * 0.049;
            } else if (fromCurrency.equals("KRW") && toCurrency.equals("AED")) {
                return amount * 0.0036;
            } else if (fromCurrency.equals("KRW") && toCurrency.equals("INR")) {
                return amount * 0.073;
            }

            return 0.0;
        }

    }

    public static void main(String[] args) {
        CurrencyCalculatorMain calculator = new CurrencyCalculatorMain();
        calculator.createAndShowGUI();
    }
}


       