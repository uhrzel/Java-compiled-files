import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class MainDashboard {
    private JFrame frame;
    private JButton startButton;

    public void createAndShowGUI() {
        frame = new JFrame("Main Dashboard");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        startButton = new JButton("Start");
        startButton.addActionListener(new StartButtonListener());

        frame.getContentPane().add(startButton);

        frame.setVisible(true);
    }

    private class StartButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame.setVisible(false);
            showOptions();
        }
    }

    private void showOptions() {
        JFrame optionsFrame = new JFrame("Options");
        optionsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        optionsFrame.setSize(300, 200);
        optionsFrame.setLayout(new FlowLayout());

        JButton currencyButton = createOptionButton("Currency Calculator");
        currencyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                optionsFrame.setVisible(false);
                showCurrencyCalculator();
            }
        });

        JButton gradebookButton = createOptionButton("Gradebook");
        gradebookButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                optionsFrame.setVisible(false);
                showGradebook();
            }
        });

        JButton roseZodiacButton = createOptionButton("Rose Zodiac");
        roseZodiacButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                optionsFrame.setVisible(false);
                displayRoseZodiac();
            }
        });

        optionsFrame.getContentPane().add(currencyButton);
        optionsFrame.getContentPane().add(gradebookButton);
        optionsFrame.getContentPane().add(roseZodiacButton);

        optionsFrame.setVisible(true);
    }

    private JButton createOptionButton(String label) {
        JButton button = new JButton(label);
        button.setPreferredSize(new Dimension(200, 30));
        return button;
    }

    private void showCurrencyCalculator() {
    	class CurrencyCalculatorMain {
    	    private JFrame frame;
    	    private JComboBox<String> fromComboBox;
    	    private JComboBox<String> toComboBox;
    	    private JTextField amountField;
    	    private JLabel resultLabel;

    	    public void createAndShowGUI() {
    	        frame = new JFrame("Currency Calculator");
    	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	        frame.setSize(300, 200);
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

    	        frame.getContentPane().add(fromPanel);
    	        frame.getContentPane().add(toPanel);
    	        frame.getContentPane().add(amountPanel);
    	        frame.getContentPane().add(convertButton);
    	        frame.getContentPane().add(resultPanel);

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

    	    class ConvertButtonListener implements ActionListener {
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
    	}
    	}

    private void showGradebook() {
    	class GradebookMain {
    	    private JFrame frame;
    	    private JTextField nameTextField, sectionTextField, prelimTextField, midtermTextField, preFinalsTextField, finalsTextField, averageTextField;

    	    public void initialize() {
    	        frame = new JFrame();
    	        frame.setBounds(100, 100, 400, 400);
    	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	        frame.getContentPane().setBackground(new Color(135, 206, 250)); // Set background color to sky blue
    	        frame.setLayout(null);

    	        JLabel titleLabel = new JLabel("TRANSMUTING GRADE CALCULATOR");
    	        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
    	        titleLabel.setForeground(Color.WHITE);
    	        titleLabel.setBounds(50, 20, 300, 30); // Adjust the position of the title
    	        frame.add(titleLabel);

    	        JLabel nameLabel = new JLabel("Name:");
    	        nameLabel.setBounds(20, 80, 100, 20);
    	        frame.add(nameLabel);

    	        nameTextField = new JTextField();
    	        nameTextField.setBounds(120, 80, 200, 20);
    	        frame.add(nameTextField);
    	        nameTextField.setColumns(10);

    	        JLabel sectionLabel = new JLabel("Section:");
    	        sectionLabel.setBounds(20, 110, 100, 20);
    	        frame.add(sectionLabel);

    	        sectionTextField = new JTextField();
    	        sectionTextField.setBounds(120, 110, 200, 20);
    	        frame.add(sectionTextField);
    	        sectionTextField.setColumns(10);

    	        JLabel prelimLabel = new JLabel("Prelim:");
    	        prelimLabel.setBounds(20, 140, 100, 20);
    	        frame.add(prelimLabel);

    	        prelimTextField = new JTextField();
    	        prelimTextField.setBounds(120, 140, 200, 20);
    	        frame.add(prelimTextField);
    	        prelimTextField.setColumns(10);

    	        JLabel midtermLabel = new JLabel("Midterm:");
    	        midtermLabel.setBounds(20, 170, 100, 20);
    	        frame.add(midtermLabel);

    	        midtermTextField = new JTextField();
    	        midtermTextField.setBounds(120, 170, 200, 20);
    	        frame.add(midtermTextField);
    	        midtermTextField.setColumns(10);

    	        JLabel preFinalsLabel = new JLabel("Pre-Finals:");
    	        preFinalsLabel.setBounds(20, 200, 100, 20);
    	        frame.add(preFinalsLabel);

    	        preFinalsTextField = new JTextField();
    	        preFinalsTextField.setBounds(120, 200, 200, 20);
    	        frame.add(preFinalsTextField);
    	        preFinalsTextField.setColumns(10);

    	        JLabel finalsLabel = new JLabel("Finals:");
    	        finalsLabel.setBounds(20, 230, 100, 20);
    	        frame.add(finalsLabel);

    	        finalsTextField = new JTextField();
    	        finalsTextField.setBounds(120, 230, 200, 20);
    	        frame.add(finalsTextField);
    	        finalsTextField.setColumns(10);

    	        JButton calculateButton = new JButton("Calculate");
    	        calculateButton.setBounds(120, 260, 100, 30);
    	        frame.add(calculateButton);

    	        JLabel averageLabel = new JLabel("Average:");
    	        averageLabel.setBounds(20, 300, 100, 20);
    	        frame.add(averageLabel);

    	        averageTextField = new JTextField();
    	        averageTextField.setBounds(120, 300, 200, 20);
    	        averageTextField.setEditable(false);
    	        frame.add(averageTextField);
    	        averageTextField.setColumns(10);

    	        JButton clearButton = new JButton("Clear");
    	        clearButton.setBounds(240, 260, 80, 30);
    	        frame.add(clearButton);

    	        calculateButton.addActionListener(new ActionListener() {
    	            public void actionPerformed(ActionEvent e) {
    	                calculateAverageGrade();
    	            }
    	        });

    	        clearButton.addActionListener(new ActionListener() {
    	            public void actionPerformed(ActionEvent e) {
    	                clearFields();
    	            }
    	        });

    	        frame.setVisible(true);
    	    }

    	    private void calculateAverageGrade() {
    	        String name = nameTextField.getText();
    	        String section = sectionTextField.getText();
    	        double prelim = Double.parseDouble(prelimTextField.getText());
    	        double midterm = Double.parseDouble(midtermTextField.getText());
    	        double preFinals = Double.parseDouble(preFinalsTextField.getText());
    	        double finals = Double.parseDouble(finalsTextField.getText());

    	        double average = (prelim + midterm + preFinals + finals) / 4;

    	        averageTextField.setText(String.format("%.2f", average));
    	    }

    	    private void clearFields() {
    	        nameTextField.setText("");
    	        sectionTextField.setText("");
    	        prelimTextField.setText("");
    	        midtermTextField.setText("");
    	        preFinalsTextField.setText("");
    	        finalsTextField.setText("");
    	        averageTextField.setText("");
    	    }
    	}
    }

    private void displayRoseZodiac() {
    	 class roseZodiac extends JFrame {
    		    private JTextField dayTextField;
    		    private JTextField monthTextField;
    		    private JLabel resultLabel;

    		    private final Map<String, Integer> monthMap = new HashMap<>();

    		    public roseZodiac() {
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

    		        initializeMonthMap();
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

    		    class CalculateButtonListener implements ActionListener {
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
    	 }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                MainDashboard dashboard = new MainDashboard();
                dashboard.createAndShowGUI();
            }
        });
    }
}
