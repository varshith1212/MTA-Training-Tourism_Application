import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class customized_details {

	public JFrame frame;
	private JTextField source;
	private JTextField destination;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					customized_details window = new customized_details();
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
	public customized_details() {
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
		
		JLabel label1 = new JLabel("Source");
		label1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 17));
		label1.setBounds(24, 52, 54, 14);
		frame.getContentPane().add(label1);
		
		JLabel lblNewLabel_1 = new JLabel("Destination");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_1.setBounds(214, 52, 86, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		source = new JTextField();
		source.setBounds(88, 51, 116, 20);
		frame.getContentPane().add(source);
		source.setColumns(10);
		
		destination = new JTextField();
		destination.setBounds(310, 51, 114, 20);
		frame.getContentPane().add(destination);
		destination.setColumns(10);
		
		JRadioButton air_ways = new JRadioButton("Air Ways");
		air_ways.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		air_ways.setBounds(49, 119, 86, 20);
		frame.getContentPane().add(air_ways);
		
		JRadioButton railways = new JRadioButton("Railways");
		railways.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		railways.setBounds(164, 119, 74, 20);
		frame.getContentPane().add(railways);
		
		JRadioButton onroad = new JRadioButton("On Road");
		onroad.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		onroad.setBounds(278, 118, 74, 23);
		frame.getContentPane().add(onroad);
		
		JLabel label4 = new JLabel("Select type of Stay:");
		label4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 17));
		label4.setBounds(26, 160, 165, 20);
		frame.getContentPane().add(label4);
		
		JLabel label3 = new JLabel("Select Mode of Transport:");
		label3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 17));
		label3.setBounds(24, 89, 214, 14);
		frame.getContentPane().add(label3);
		
		JRadioButton five_star = new JRadioButton("5-Star");
		five_star.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		five_star.setBounds(49, 187, 86, 23);
		frame.getContentPane().add(five_star);
		
		JRadioButton three_star = new JRadioButton("3-Star");
		three_star.setFont(new Font("Tahoma", Font.PLAIN, 13));
		three_star.setBounds(164, 187, 86, 23);
		frame.getContentPane().add(three_star);
		
		JRadioButton two_star = new JRadioButton("2-Star");
		two_star.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		two_star.setBounds(281, 187, 109, 23);
		frame.getContentPane().add(two_star);
		
		JButton submit = new JButton("Proceed");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cusomized_summary s= new cusomized_summary();
				s.frame.setVisible(true);
			}
		});
		submit.setForeground(Color.BLUE);
		submit.setBackground(Color.WHITE);
		submit.setBounds(163, 227, 89, 23);
		frame.getContentPane().add(submit);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ADMIN\\Downloads\\141_20201013185512_Consumer Survey Finds 70 Percent of Travelers Plan to Holiday in 2021.jpg"));
		lblNewLabel.setBounds(-61, -12, 540, 343);
		frame.getContentPane().add(lblNewLabel);
	}
}
