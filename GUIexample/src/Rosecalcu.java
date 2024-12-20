
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.ImageIcon;
import javax.swing.border.EmptyBorder;


public class Rosecalcu {

	JFrame frame;
	private JLayeredPane layeredPane;
	private JTextField txtnum1;
	private JTextField txtnum2;
	private JTextField txttot1;
	private JTextField txttot2;
	private JTextField txtnum4;
	private JTextField txtnum3;
	private JTextField txtavg;
	private JTextField txtre;
	private JTextField txtn1;
	private JTextField txtn2;
	private JTextField txtn3;
	private JTextField txtn4;
	private JTextField txtn5;
	private JTextField txtn6;
	private JTextField txtavg2;
	private JTextField txtre2;
	private JTextField txtf1;
	private JTextField txtf2;
	private JTextField txtf3;
	private JTextField txtf4;
	private JTextField txtf5;
	private JTextField txtf6;
	private JTextField txtavg3;
	private JTextField txtre3;
	private JTextField txtffg1;
	private JTextField txtffg2;
	private JTextField txtffg3;
	private JTextField txtavg4;
	private JTextField txtre4;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rosecalcu window = new Rosecalcu();
					window.getFrame().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Rosecalcu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setFrame(new JFrame());
		getFrame().getContentPane().setBackground(Color.PINK);
		getFrame().setBounds(100, 100, 540, 490);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getFrame().getContentPane().setLayout(null);
		
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(240, 33, 255, 375);
		getFrame().getContentPane().add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel home = new JPanel();
		home.setForeground(new Color(0, 0, 0));
		home.setBorder(new EmptyBorder(0, 0, 0, 0));
		home.setBackground(Color.DARK_GRAY);
		layeredPane.add(home, "name_427333716259600");
		home.setLayout(null);
		
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

	        
		JLabel lblNewLabel_8 = new JLabel("Grade Calculator");
		lblNewLabel_8.setForeground(new Color(255, 255, 255));
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_8.setBounds(67, 116, 141, 112);
		home.add(lblNewLabel_8);
		
		JPanel panel1 = new JPanel();
		panel1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel1.setBackground(Color.WHITE);
		layeredPane.add(panel1, "name_427342400928500");
		panel1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Prelim");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(106, 11, 59, 20);
		panel1.add(lblNewLabel);
		
		JLabel lblNewLabel_4 = new JLabel("Score:");
		lblNewLabel_4.setBounds(21, 74, 59, 14);
		panel1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Over:");
		lblNewLabel_4_1.setBounds(21, 116, 46, 14);
		panel1.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("CS:");
		lblNewLabel_4_2.setBounds(21, 159, 46, 14);
		panel1.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_4_3 = new JLabel("Score:");
		lblNewLabel_4_3.setBounds(132, 74, 59, 14);
		panel1.add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_4_4 = new JLabel("Over:");
		lblNewLabel_4_4.setBounds(132, 116, 46, 14);
		panel1.add(lblNewLabel_4_4);
		
		JLabel lblNewLabel_4_5 = new JLabel("Exam:");
		lblNewLabel_4_5.setBounds(132, 159, 46, 14);
		panel1.add(lblNewLabel_4_5);
		
		JLabel lblNewLabel_4_6 = new JLabel("Average:");
		lblNewLabel_4_6.setBounds(48, 226, 46, 14);
		panel1.add(lblNewLabel_4_6);
		
		JLabel lblNewLabel_4_7 = new JLabel("Result");
		lblNewLabel_4_7.setBounds(48, 265, 46, 14);
		panel1.add(lblNewLabel_4_7);
		
		txtnum1 = new JTextField();
		txtnum1.setBounds(76, 71, 46, 21);
		panel1.add(txtnum1);
		txtnum1.setColumns(10);
		
		txtnum2 = new JTextField();
		txtnum2.setColumns(10);
		txtnum2.setBounds(77, 113, 46, 21);
		panel1.add(txtnum2);
		
		txttot1 = new JTextField();
		txttot1.setColumns(10);
		txttot1.setBounds(77, 152, 46, 21);
		panel1.add(txttot1);
		
		txttot2 = new JTextField();
		txttot2.setColumns(10);
		txttot2.setBounds(188, 152, 46, 21);
		panel1.add(txttot2);
		
		txtnum4 = new JTextField();
		txtnum4.setColumns(10);
		txtnum4.setBounds(188, 113, 46, 21);
		panel1.add(txtnum4);
		
		txtnum3 = new JTextField();
		txtnum3.setColumns(10);
		txtnum3.setBounds(188, 71, 46, 21);
		panel1.add(txtnum3);
		
		txtavg = new JTextField();
		txtavg.setColumns(10);
		txtavg.setBounds(106, 223, 46, 21);
		panel1.add(txtavg);
		
		txtre = new JTextField();
		txtre.setColumns(10);
		txtre.setBounds(106, 262, 46, 21);
		panel1.add(txtre);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				double p1 = Integer.parseInt(txtnum1.getText());
				double p2 = Integer.parseInt(txtnum2.getText());
				double tot1 = (((p1 / p2) * 50) + 50) * .60;
				
				double p3 = Integer.parseInt(txtnum3.getText());
				double p4 = Integer.parseInt(txtnum4.getText());
				double tot2 = (((p3 / p4) * 50) + 50) * .40;
				
				double avg = tot1 + tot2;
				
				

				txttot1.setText(String.valueOf(tot1));
				txttot2.setText(String.valueOf(tot2));
				txtavg.setText(String.valueOf(avg));
				
				
				if(avg > 75)
				{
					txtre.setText("Pass");
				}
				else
					txtre.setText("Fail");
				
				
				
			}
		});
		btnNewButton.setBounds(145, 325, 89, 23);
		panel1.add(btnNewButton);
		
		JPanel panel2 = new JPanel();
		panel2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel2.setBackground(Color.LIGHT_GRAY);
		layeredPane.add(panel2, "name_427344777216400");
		panel2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Midterm");
		lblNewLabel_1.setBounds(99, 11, 62, 19);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_5 = new JLabel("Score:");
		lblNewLabel_5.setBounds(24, 88, 46, 14);
		panel2.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("Over:");
		lblNewLabel_5_1.setBounds(24, 125, 46, 14);
		panel2.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("CS:");
		lblNewLabel_5_2.setBounds(24, 163, 46, 14);
		panel2.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_5_3 = new JLabel("Score:");
		lblNewLabel_5_3.setBounds(130, 88, 46, 14);
		panel2.add(lblNewLabel_5_3);
		
		JLabel lblNewLabel_5_4 = new JLabel("Over:");
		lblNewLabel_5_4.setBounds(130, 125, 46, 14);
		panel2.add(lblNewLabel_5_4);
		
		JLabel lblNewLabel_5_5 = new JLabel("Exam:");
		lblNewLabel_5_5.setBounds(130, 163, 46, 14);
		panel2.add(lblNewLabel_5_5);
		
		JLabel lblNewLabel_5_7 = new JLabel("Result:");
		lblNewLabel_5_7.setBounds(57, 261, 46, 14);
		panel2.add(lblNewLabel_5_7);
		
		JLabel lblNewLabel_5_8 = new JLabel("Average:");
		lblNewLabel_5_8.setBounds(57, 223, 46, 14);
		panel2.add(lblNewLabel_5_8);
		
		txtn1 = new JTextField();
		txtn1.setBounds(74, 85, 46, 19);
		panel2.add(txtn1);
		txtn1.setColumns(10);
		
		txtn2 = new JTextField();
		txtn2.setColumns(10);
		txtn2.setBounds(74, 122, 46, 19);
		panel2.add(txtn2);
		
		txtn3 = new JTextField();
		txtn3.setColumns(10);
		txtn3.setBounds(74, 158, 46, 19);
		panel2.add(txtn3);
		
		txtn4 = new JTextField();
		txtn4.setColumns(10);
		txtn4.setBounds(186, 85, 46, 19);
		panel2.add(txtn4);
		
		txtn5 = new JTextField();
		txtn5.setColumns(10);
		txtn5.setBounds(186, 122, 46, 19);
		panel2.add(txtn5);
		
		txtn6 = new JTextField();
		txtn6.setColumns(10);
		txtn6.setBounds(186, 160, 46, 19);
		panel2.add(txtn6);
		
		txtavg2 = new JTextField();
		txtavg2.setColumns(10);
		txtavg2.setBounds(113, 220, 46, 19);
		panel2.add(txtavg2);
		
		txtre2 = new JTextField();
		txtre2.setColumns(10);
		txtre2.setBounds(113, 258, 46, 19);
		panel2.add(txtre2);
		
		JButton btnNewButton_1 = new JButton("Calculate");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				double n1 = Integer.parseInt(txtn1.getText());
				double n2 = Integer.parseInt(txtn2.getText());
				double n3 = (((n1 / n2) * 50) + 50) * .60;
				
				double n4 = Integer.parseInt(txtn4.getText());
				double n5 = Integer.parseInt(txtn5.getText());
				double n6 = (((n4 / n5) * 50) + 50) * .40;
				
				double avg2 = n3 + n6;
				
				

				txtn3.setText(String.valueOf(n3));
				txtn6.setText(String.valueOf(n6));
				txtavg2.setText(String.valueOf(avg2));
				
				
				if(avg2 > 75)
				{
					txtre2.setText("Pass");
				}
				else
					txtre2.setText("Fail");
				
				
			}
		});
		btnNewButton_1.setBounds(143, 315, 89, 23);
		panel2.add(btnNewButton_1);
		
		JPanel panel3 = new JPanel();
		panel3.setBackground(Color.LIGHT_GRAY);
		panel3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		layeredPane.add(panel3, "name_427346538753800");
		panel3.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Tentative Final");
		lblNewLabel_2.setBounds(71, 11, 112, 19);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel3.add(lblNewLabel_2);
		
		JLabel lblNewLabel_6 = new JLabel("Score:");
		lblNewLabel_6.setBounds(24, 87, 46, 14);
		panel3.add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("Over:");
		lblNewLabel_6_1.setBounds(24, 123, 46, 14);
		panel3.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6_2 = new JLabel("CS:");
		lblNewLabel_6_2.setBounds(24, 161, 46, 14);
		panel3.add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_6_3 = new JLabel("Score:");
		lblNewLabel_6_3.setBounds(137, 87, 46, 14);
		panel3.add(lblNewLabel_6_3);
		
		JLabel lblNewLabel_6_4 = new JLabel("Over:");
		lblNewLabel_6_4.setBounds(137, 123, 46, 14);
		panel3.add(lblNewLabel_6_4);
		
		JLabel lblNewLabel_6_5 = new JLabel("Exam:");
		lblNewLabel_6_5.setBounds(137, 161, 46, 14);
		panel3.add(lblNewLabel_6_5);
		
		JLabel lblNewLabel_6_6 = new JLabel("Average:");
		lblNewLabel_6_6.setBounds(58, 227, 46, 14);
		panel3.add(lblNewLabel_6_6);
		
		JLabel lblNewLabel_6_7 = new JLabel("Result:");
		lblNewLabel_6_7.setBounds(58, 267, 46, 14);
		panel3.add(lblNewLabel_6_7);
		
		txtf1 = new JTextField();
		txtf1.setBounds(80, 84, 46, 19);
		panel3.add(txtf1);
		txtf1.setColumns(10);
		
		txtf2 = new JTextField();
		txtf2.setColumns(10);
		txtf2.setBounds(81, 120, 46, 19);
		panel3.add(txtf2);
		
		txtf3 = new JTextField();
		txtf3.setColumns(10);
		txtf3.setBounds(80, 158, 46, 19);
		panel3.add(txtf3);
		
		txtf4 = new JTextField();
		txtf4.setColumns(10);
		txtf4.setBounds(193, 84, 46, 19);
		panel3.add(txtf4);
		
		txtf5 = new JTextField();
		txtf5.setColumns(10);
		txtf5.setBounds(193, 120, 46, 19);
		panel3.add(txtf5);
		
		txtf6 = new JTextField();
		txtf6.setColumns(10);
		txtf6.setBounds(193, 158, 46, 19);
		panel3.add(txtf6);
		
		txtavg3 = new JTextField();
		txtavg3.setColumns(10);
		txtavg3.setBounds(114, 224, 46, 19);
		panel3.add(txtavg3);
		
		txtre3 = new JTextField();
		txtre3.setColumns(10);
		txtre3.setBounds(114, 264, 46, 19);
		panel3.add(txtre3);
		
		JButton btnNewButton_2 = new JButton("Calculate");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				double f1 = Integer.parseInt(txtf1.getText());
				double f2 = Integer.parseInt(txtf2.getText());
				double f3 = (((f1 / f2) * 50) + 50) * .60;
				
				double f4 = Integer.parseInt(txtf4.getText());
				double f5 = Integer.parseInt(txtf5.getText());
				double f6 = (((f4 / f5) * 50) + 50) * .40;
				
				double avg3 = f3 + f6;
				
				

				txtf3.setText(String.valueOf(f3));
				txtf6.setText(String.valueOf(f6));
				txtavg3.setText(String.valueOf(avg3));
				
				
				if(avg3 > 75)
				{
					txtre3.setText("Pass");
				}
				else
					txtre3.setText("Fail");
				
				
				
				
			}
		});
		btnNewButton_2.setBounds(137, 319, 89, 23);
		panel3.add(btnNewButton_2);
		
		JPanel panel4 = new JPanel();
		panel4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel4.setBackground(new Color(255, 255, 128));
		layeredPane.add(panel4, "name_427358898766400");
		panel4.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Final Final Grade");
		lblNewLabel_3.setBounds(67, 11, 127, 19);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel4.add(lblNewLabel_3);
		
		JLabel lblNewLabel_7 = new JLabel("Prelim:");
		lblNewLabel_7.setBounds(44, 81, 46, 14);
		panel4.add(lblNewLabel_7);
		
		JLabel lblNewLabel_7_1 = new JLabel("Midterm:");
		lblNewLabel_7_1.setBounds(44, 119, 46, 14);
		panel4.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_7_2 = new JLabel("TF:");
		lblNewLabel_7_2.setBounds(44, 163, 46, 14);
		panel4.add(lblNewLabel_7_2);
		
		JLabel lblNewLabel_7_3 = new JLabel("FFG:");
		lblNewLabel_7_3.setBounds(69, 231, 46, 14);
		panel4.add(lblNewLabel_7_3);
		
		JLabel lblNewLabel_7_4 = new JLabel("Result:");
		lblNewLabel_7_4.setBounds(69, 270, 46, 14);
		panel4.add(lblNewLabel_7_4);
		
		txtffg1 = new JTextField();
		txtffg1.setBounds(115, 78, 46, 19);
		panel4.add(txtffg1);
		txtffg1.setColumns(10);
		
		txtffg2 = new JTextField();
		txtffg2.setColumns(10);
		txtffg2.setBounds(115, 116, 46, 19);
		panel4.add(txtffg2);
		
		txtffg3 = new JTextField();
		txtffg3.setColumns(10);
		txtffg3.setBounds(115, 160, 46, 19);
		panel4.add(txtffg3);
		
		txtavg4 = new JTextField();
		txtavg4.setColumns(10);
		txtavg4.setBounds(125, 228, 94, 19);
		panel4.add(txtavg4);
		
		txtre4 = new JTextField();
		txtre4.setColumns(10);
		txtre4.setBounds(125, 267, 94, 19);
		panel4.add(txtre4);
		
		JButton btnNewButton_3 = new JButton("Calculate");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				int ffg1 = Integer.parseInt(txtffg1.getText());
				int ffg2 = Integer.parseInt(txtffg2.getText());
				int ffg3 = Integer.parseInt(txtffg3.getText());
				double avg4 = (ffg1 * .30) + (ffg2 * .30) + (ffg3 * .40);
				
				
				
				txtavg4.setText(String.valueOf(avg4));
				
				
				if(avg4 > 75)
				{
					txtre4.setText("Pass");
				}
				else
					txtre4.setText("Fail");
				
				
				
				
			}
		});
		btnNewButton_3.setBounds(143, 323, 89, 23);
		panel4.add(btnNewButton_3);
		
		JButton btnpre = new JButton("Prelim");
		btnpre.setFont(new Font("Arial", Font.PLAIN, 11));
		btnpre.setForeground(new Color(128, 128, 0));
		btnpre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				layeredPane.removeAll();
				layeredPane.add(panel1);
				layeredPane.repaint();
				layeredPane.revalidate();
				
				
				
			}
		});
		btnpre.setBounds(55, 65, 99, 35);
		getFrame().getContentPane().add(btnpre);
		
		JButton btnmid = new JButton("Mid");
		btnmid.setForeground(new Color(128, 128, 64));
		btnmid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				layeredPane.removeAll();
				layeredPane.add(panel2);
				layeredPane.repaint();
				layeredPane.revalidate();
				
				
			}
		});
		btnmid.setBounds(55, 115, 99, 35);
		getFrame().getContentPane().add(btnmid);
		
		JButton btntf = new JButton("TF");
		btntf.setForeground(new Color(128, 128, 128));
		btntf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				layeredPane.removeAll();
				layeredPane.add(panel3);
				layeredPane.repaint();
				layeredPane.revalidate();
				
				
			}
		});
		btntf.setBounds(55, 166, 99, 35);
		getFrame().getContentPane().add(btntf);
		
		JButton btnffg = new JButton("FFG");
		btnffg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				layeredPane.removeAll();
				layeredPane.add(panel4);
				layeredPane.repaint();
				layeredPane.revalidate();
				
				
			}
		});
		btnffg.setBounds(55, 218, 99, 35);
		getFrame().getContentPane().add(btnffg);
		
		JButton btnhome = new JButton("Back");
		btnhome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				layeredPane.removeAll();
				layeredPane.add(home);
				layeredPane.repaint();
				layeredPane.revalidate();
				
				
			}
		});
		btnhome.setBounds(55, 352, 99, 35);
		getFrame().getContentPane().add(btnhome);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}