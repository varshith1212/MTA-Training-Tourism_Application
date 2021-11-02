import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class cusomized_summary {

	public JFrame frame;
	private JTextField count_persons;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cusomized_summary window = new cusomized_summary();
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
	public cusomized_summary() {
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
		
		JLabel display_price = new JLabel("__________________");
		display_price.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		display_price.setBounds(28, 27, 369, 25);
		frame.getContentPane().add(display_price);
		
		count_persons = new JTextField();
		count_persons.setBounds(215, 74, 119, 20);
		frame.getContentPane().add(count_persons);
		count_persons.setColumns(10);
		
		JLabel label1 = new JLabel("Enter No.of Persons");
		label1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		label1.setBounds(28, 77, 160, 14);
		frame.getContentPane().add(label1);
		
		JLabel display_final_price = new JLabel("_____________");
		display_final_price.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		display_final_price.setBounds(33, 129, 364, 25);
		frame.getContentPane().add(display_final_price);
		
		JButton proceed = new JButton("Proceed");
		proceed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				summary l = new summary();
				l.frame.setVisible(true);
			}
		});
		proceed.setForeground(Color.BLUE);
		proceed.setBackground(Color.BLUE);
		proceed.setBounds(153, 187, 147, 23);
		frame.getContentPane().add(proceed);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ADMIN\\Downloads\\GettyImages-150127577-58f920153df78ca159d41100.jpg"));
		lblNewLabel.setBounds(0, 0, 451, 274);
		frame.getContentPane().add(lblNewLabel);
	}

}
