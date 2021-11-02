import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;

public class screen1 {

	private JFrame frame;
	private JTextField u1;
	private JTextField u2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					screen1 window = new screen1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public screen1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(238, 31, 75, 27);
		panel.add(lblNewLabel);
		
		JLabel img_label = new JLabel("New label");
		img_label.setBounds(0, 11, 214, 195);
		panel.add(img_label);
		
		Image img = new ImageIcon(this.getClass().getResource("/mrec.jpg")).getImage();
		img_label.setIcon(new ImageIcon(img));
		
		u1 = new JTextField();
		u1.setBounds(328, 33, 96, 26);
		panel.add(u1);
		u1.setColumns(10);
		
		JLabel password = new JLabel("password");
		password.setFont(new Font("Tahoma", Font.PLAIN, 14));
		password.setBounds(238, 93, 63, 27);
		panel.add(password);
		
		JButton btn = new JButton("Login");
		btn.setBackground(Color.GREEN);
		btn.setBounds(270, 156, 96, 33);
		panel.add(btn);
		
		u2 = new JTextField();
		u2.setBounds(328, 93, 96, 25);
		panel.add(u2);
		u2.setColumns(10);
		
		JLabel l2 = new JLabel("New label");
		l2.setBounds(290, 218, 106, 14);
		panel.add(l2);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				/*
				if(u1.getText().equals("varshith") == u2.getText().equals("12345")) {
					screen3 l = new screen3();
					l.frame.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(frame,"Incorrect Details");
				}*/
				String ex = u1.getText();
				l2.setText("Welcome "+ex);
			}
			
		});
	}
}
