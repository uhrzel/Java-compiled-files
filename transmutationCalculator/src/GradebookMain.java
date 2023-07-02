import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GradebookMain {
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

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                GradebookMain gradebook = new GradebookMain();
                gradebook.initialize();
            }
        });
    }
}



