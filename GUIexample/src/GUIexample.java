import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class GUIexample {
    private JFrame mainFrame;
    private JFrame secondaryFrame;
    private roseZodiac zodiacFrame;

    public GUIexample() {
        // Create the main frame
        mainFrame = new JFrame("Main Frame");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(500, 600);
        mainFrame.setLayout(null);

        // Load and resize the background image
        try {
            BufferedImage backgroundImage = ImageIO.read(new File("b.jpg"));
            BufferedImage resizedImage = resizeImage(backgroundImage, mainFrame.getWidth(), mainFrame.getHeight());
            mainFrame.setContentPane(new JLabel(new ImageIcon(resizedImage)));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Create the start button
        JButton startButton = new JButton("Start");
        startButton.setBounds(200, 200, 100, 50);
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showSecondaryFrame();
            }
        });
        startButton.setOpaque(true);
        startButton.setBackground(new Color(255, 255, 255, 128));

        // Add the start button to the main frame
        mainFrame.add(startButton);

        // Display the main frame
        mainFrame.setVisible(true);
    }

    void showSecondaryFrame() {
        // Create the secondary frame
        secondaryFrame = new JFrame("Secondary Frame");
        secondaryFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        secondaryFrame.setSize(500, 600);
        secondaryFrame.setLayout(null);

        // Load and resize the background image
        try {
            BufferedImage backgroundImage = ImageIO.read(new File("b.jpg"));
            BufferedImage resizedImage = resizeImage(backgroundImage, secondaryFrame.getWidth(), secondaryFrame.getHeight());
            secondaryFrame.setContentPane(new JLabel(new ImageIcon(resizedImage)));
        } catch (IOException e) {
            e.printStackTrace();
        }
       
        int buttonWidth = 100;
        int buttonHeight = 50;
        int buttonSpacing = 20;
        int startX = (secondaryFrame.getWidth() - buttonWidth) / 2;
        int startY = 200;

        String[] buttonNames = { "ZODIAC", "CURRENCY", "CALCULATOR", "GRADE" }; // Array of button names

        for (int i = 0; i < buttonNames.length; i++) {
            String buttonName = buttonNames[i];
            JButton button = new JButton(buttonName);
            button.setBounds(startX, startY, buttonWidth, buttonHeight);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (buttonName.equals("ZODIAC")) {
                        showZodiacFrame();
                    } else if (buttonName.equals("CURRENCY")) {
                        showCalcFrame();
                    } else if (buttonName.equals("CALCULATOR")) {
                        showroseFrame();
                    } else if (buttonName.equals("GRADE")) {
                        showroseCalcu();
                    } else {
                        // Handle other button actions if needed
                    }
                }	
            });
            secondaryFrame.add(button);
            startY += buttonHeight + buttonSpacing;
        }
        JLabel titleLabel = new JLabel("SELECT OPTIONS");
        titleLabel.setFont(new Font("Arial black", Font.BOLD, 20)); // Set font and size
        titleLabel.setBounds(0, 100, secondaryFrame.getWidth(), 50); // Set position and size
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setForeground(Color.black); // Center align the text
        secondaryFrame.add(titleLabel);
        // Create the back button
        JButton backButton = new JButton("Back");
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                secondaryFrame.dispose(); // Close the secondary frame
                mainFrame.setVisible(true); // Show the main frame
            }
        });
        backButton.setBounds(startX, startY, buttonWidth, buttonHeight);
        secondaryFrame.add(backButton);

        // Display the secondary frame
        secondaryFrame.setVisible(true);
    }

    private void showZodiacFrame() {
        zodiacFrame = new roseZodiac();
        zodiacFrame.setVisible(true);
    }

    private void showCalcFrame() {
        mainFrame.dispose(); // Close the main frame
        CurrencyCalculatorMain calculator = new CurrencyCalculatorMain();
        calculator.createAndShowGUI();
    }

    private void showroseFrame() {
        roseper window = new roseper();
    }

    private void showroseCalcu() {
        Rosecalcu window = new Rosecalcu();
        window.frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new GUIexample();
            }
        });
    }

    private BufferedImage resizeImage(BufferedImage originalImage, int width, int height) {
        BufferedImage resizedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics2D = resizedImage.createGraphics();
        graphics2D.drawImage(originalImage, 0, 0, width, height, null);
        graphics2D.dispose();
        return resizedImage;
    }

    public void createAndShowGUI() {
        // TODO Auto-generated method stub
    }
}
