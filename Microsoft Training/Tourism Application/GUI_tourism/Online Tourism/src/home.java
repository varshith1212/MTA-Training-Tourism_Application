import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class home {

	private JFrame frame;
	private JTextField name;
	private JTextField mobile;
	private JTextField email;
	private JButton submit;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					home window = new home();
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
	public home() {
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
		
		JLabel Heading = new JLabel("Online Tourism");
		Heading.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 30));
		Heading.setHorizontalAlignment(SwingConstants.CENTER);
		Heading.setBounds(58, 11, 315, 45);
		frame.getContentPane().add(Heading);
		
		JLabel label1 = new JLabel("Name");
		label1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		label1.setBounds(58, 81, 57, 14);
		frame.getContentPane().add(label1);
		
		name = new JTextField();
		name.setBackground(UIManager.getColor("Button.background"));
		name.setBounds(191, 80, 156, 20);
		frame.getContentPane().add(name);
		name.setColumns(10);
		String person_name = name.getText();
		
		JLabel label2 = new JLabel("Mobile No.");
		label2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		label2.setBounds(58, 122, 139, 14);
		frame.getContentPane().add(label2);
		
		mobile = new JTextField();
		mobile.setBackground(UIManager.getColor("Button.background"));
		mobile.setBounds(191, 121, 156, 20);
		frame.getContentPane().add(mobile);
		mobile.setColumns(10);
		String number = mobile.getText();
		
		email = new JTextField();
		email.setBackground(UIManager.getColor("Button.background"));
		email.setBounds(191, 163, 156, 20);
		frame.getContentPane().add(email);
		email.setColumns(10);
		String mail = email.getText();
		
		JLabel label3 = new JLabel("Email");
		label3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		label3.setBounds(58, 164, 64, 14);
		frame.getContentPane().add(label3);
		
		submit = new JButton("Proceed");
		submit.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		submit.setBounds(210, 214, 89, 23);
		frame.getContentPane().add(submit);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ADMIN\\Downloads\\WhatsApp Image 2021-11-02 at 11.27.26 AM.jpeg"));
		lblNewLabel.setBounds(-15, 0, 449, 320);
		frame.getContentPane().add(lblNewLabel);
		submit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				category l=new category();
				l.frame.setVisible(true);
				
			}
			
		});
	}
}
