import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;

public class screen2{

	private JFrame frame;
	private JTextField name_txt;
	private JTextField username_txt;
	private JPasswordField pwd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					screen2 window = new screen2();
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
	public screen2() {
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
		
		JLabel img_label = new JLabel("img");
		img_label.setBounds(10, 23, 203, 209);
		panel.add(img_label);
		
		Image img = new ImageIcon(this.getClass().getResource("/mrec.jpg")).getImage();
		img_label.setIcon(new ImageIcon(img));
		
		JLabel name = new JLabel("Name");
		name.setFont(new Font("Tahoma", Font.PLAIN, 14));
		name.setBounds(232, 48, 60, 25);
		panel.add(name);
		
		name_txt = new JTextField();
		name_txt.setBounds(318, 52, 86, 20);
		panel.add(name_txt);
		name_txt.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("User Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(232, 106, 76, 14);
		panel.add(lblNewLabel);
		
		username_txt = new JTextField();
		username_txt.setBounds(318, 103, 86, 20);
		panel.add(username_txt);
		username_txt.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(232, 150, 66, 14);
		panel.add(lblNewLabel_1);
		
		pwd = new JPasswordField();
		pwd.setBounds(318, 147, 86, 20);
		panel.add(pwd);
		
		
		JButton submit_btn = new JButton("Submit");
		submit_btn.setBackground(new Color(169, 169, 169));
		submit_btn.setBounds(272, 199, 89, 33);
		panel.add(submit_btn);
		submit_btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//if()
			
			}
			
		});
	}

}
