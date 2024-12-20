import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class roseper implements ActionListener {

    private JFrame frame;
    private JTextField textfield;
    private JButton[] numberButtons = new JButton[10];
    private JButton[] functionButtons = new JButton[12]; // Updated to accommodate the back button and return button
    private JPanel panel;

    private Font myFont = new Font("New Courier", Font.BOLD, 30);

    private double num1 = 0, num2 = 0, result = 0;
    private char operator;
    private void setBackgroundImage(String imagePath) {
        ImageIcon backgroundImage = new ImageIcon(imagePath);
        Image img = backgroundImage.getImage();
        Image resizedImg = img.getScaledInstance(frame.getWidth(), frame.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon resizedBackgroundImage = new ImageIcon(resizedImg);

        JLabel backgroundLabel = new JLabel(resizedBackgroundImage);
        backgroundLabel.setBounds(0, 0, frame.getWidth(), frame.getHeight());
        ((JPanel) frame.getContentPane()).setOpaque(false);
        frame.getLayeredPane().add(backgroundLabel, Integer.valueOf(Integer.MIN_VALUE));
    }

    roseper() {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 600);
        frame.setLayout(null);

        textfield = new JTextField();
        textfield.setBounds(50, 25, 300, 50);
        textfield.setFont(myFont);
        textfield.setEditable(false);

        JButton addButton = new JButton("+");
        JButton subButton = new JButton("-");
        JButton mulButton = new JButton("*");
        JButton divButton = new JButton("/");
        JButton decButton = new JButton(".");
        JButton equButton = new JButton("=");
        JButton delButton = new JButton("Del");
        JButton clrButton = new JButton("Clr");
        JButton negButton = new JButton("(-)");
        JButton percentButton = new JButton("%");
        JButton backButton = new JButton("Back");
        JButton returnButton = new JButton("Return"); // New return button

        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = decButton;
        functionButtons[5] = equButton;
        functionButtons[6] = delButton;
        functionButtons[7] = clrButton;
        functionButtons[8] = negButton;
        functionButtons[9] = percentButton;
        functionButtons[10] = backButton;
        functionButtons[11] = returnButton; // Added the return button to the array

        for (int l = 0; l < 12; l++) { // Updated the loop to include the back button
            functionButtons[l].addActionListener(this);
            functionButtons[l].setFont(myFont);
            functionButtons[l].setFocusable(false);
        }

        for (int l = 0; l < 10; l++) {
            numberButtons[l] = new JButton(String.valueOf(l));
            numberButtons[l].addActionListener(this);
            numberButtons[l].setFont(myFont);
            numberButtons[l].setFocusable(false);
        }

        negButton.setBounds(50, 500, 100, 50);
        delButton.setBounds(250, 500, 100, 50);
        clrButton.setBounds(150, 500, 100, 50);
        percentButton.setBounds(95, 430, 200, 50);

        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(numberButtons[0]);
        panel.add(equButton);
        panel.add(divButton);
        panel.add(percentButton);

        frame.add(panel);
        frame.add(negButton);
        frame.add(delButton);
        frame.add(clrButton);
        frame.add(percentButton);
        frame.add(textfield);
        frame.setVisible(true);
        setBackgroundImage("b.jpg");
    }
    

    public static void main(String[] args) {
        roseper window = new roseper();
    }

    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                textfield.setText(textfield.getText().concat(String.valueOf(i)));
            }
        }
        Object decButton = null;
		if (e.getSource() == decButton) {
            textfield.setText(textfield.getText().concat("."));
        }
        Object addButton = null;
		if (e.getSource() == addButton) {
            num1 = Double.parseDouble(textfield.getText());
            operator = '+';
            textfield.setText("");
        }
        Object subButton = null;
		if (e.getSource() == subButton) {
            num1 = Double.parseDouble(textfield.getText());
            operator = '-';
            textfield.setText("");
        }
        Object mulButton = null;
		if (e.getSource() == mulButton) {
            num1 = Double.parseDouble(textfield.getText());
            operator = '*';
            textfield.setText("");
        }
        Object divButton = null;
		if (e.getSource() == divButton) {
            num1 = Double.parseDouble(textfield.getText());
            operator = '/';
            textfield.setText("");
        }
        Object percentButton = null;
		if (e.getSource() == percentButton) {
            num1 = Double.parseDouble(textfield.getText());
            operator = '%';
            textfield.setText("");
        }
        Object equButton = null;
		if (e.getSource() == equButton) {
            num2 = Double.parseDouble(textfield.getText());

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                case '%':
                    result = num1 % num2;
                    break;
            }

            textfield.setText(String.valueOf(result));
            num1 = result;
        }
        Object clrButton = null;
		if (e.getSource() == clrButton) {
            textfield.setText("");
        }
        Object delButton = null;
		if (e.getSource() == delButton) {
            String string = textfield.getText();
            textfield.setText("");
            for (int i = 0; i < string.length() - 1; i++) {
                textfield.setText(textfield.getText() + string.charAt(i));
            }
        }
        Object negButton = null;
		if (e.getSource() == negButton) {
            double temp = Double.parseDouble(textfield.getText());
            temp *= -1;
            textfield.setText(String.valueOf(temp));
        }
        if (e.getSource() == functionButtons[10]) { // Check if the back button is clicked
            String currentText = textfield.getText();
            if (currentText.length() > 0) {
                currentText = currentText.substring(0, currentText.length() - 1);
                textfield.setText(currentText);
            }
        }
        if (e.getSource() == functionButtons[11]) { // Check if the return button is clicked
            frame.dispose(); // Close the calculator window
            GUIexample.main(null); // Return to the GUIexample class
        }
    }
}
