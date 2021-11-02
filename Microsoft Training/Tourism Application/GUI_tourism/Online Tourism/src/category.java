import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class category {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					category window = new category();
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
	public category() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Customized Packages");
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				customized_details c = new customized_details();
				c.frame.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnNewButton.setBounds(10, 72, 250, 33);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnFixedPackages = new JButton("Fixed Packages");
		btnFixedPackages.setHorizontalAlignment(SwingConstants.LEFT);
		btnFixedPackages.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnFixedPackages.setBounds(10, 135, 213, 33);
		frame.getContentPane().add(btnFixedPackages);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ADMIN\\Downloads\\WhatsApp Image 2021-11-02 at 11.27.00 AM.jpeg"));
		lblNewLabel.setBounds(-70, -29, 504, 290);
		frame.getContentPane().add(lblNewLabel);
	}
}
