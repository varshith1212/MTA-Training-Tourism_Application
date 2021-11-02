import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class summary {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					summary window = new summary();
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
	public summary() {
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
		
		JLabel label1 = new JLabel("Hurray!!!");
		label1.setForeground(Color.CYAN);
		label1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setBounds(67, 11, 116, 48);
		frame.getContentPane().add(label1);
		
		JLabel lblNewLabel = new JLabel("Your Journey is Fixed!!!");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setBounds(0, 89, 272, 30);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("(Travel details are sent to your email)");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setBounds(97, 229, 327, 21);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Have a Safe Journey\uD83D\uDE0A");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel_2.setForeground(Color.YELLOW);
		lblNewLabel_2.setBounds(30, 144, 247, 21);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\ADMIN\\Downloads\\WhatsApp Image 2021-11-02 at 11.27.11 AM.jpeg"));
		lblNewLabel_3.setBounds(0, 0, 476, 299);
		frame.getContentPane().add(lblNewLabel_3);
	}

}
