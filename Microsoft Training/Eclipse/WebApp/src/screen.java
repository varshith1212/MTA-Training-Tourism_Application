import java.awt.EventQueue;


import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class screen extends JFrame implements ActionListener {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					screen window = new screen();
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
	public screen() {
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
		
		JLabel l1 = new JLabel("Name");
		l1.setBounds(256, 65, 46, 14);
		frame.getContentPane().add(l1);
		
		JLabel l2 = new JLabel("Roll.No");
		l2.setBounds(256, 110, 46, 14);
		frame.getContentPane().add(l2);
		
		t1 = new JTextField();
		t1.setBounds(327, 107, 86, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(327, 62, 86, 20);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
		
		JLabel l4 = new JLabel("");
		
		JButton b1 = new JButton("Submit");
		b1.setBounds(290, 149, 89, 23);
		b1.addActionListener(new ActionListener() {
			@Override
            public void actionPerformed(ActionEvent e) {
				
				Random r = new Random();
		        int v = r.nextInt(100);
		        
				l4.setText("Your percentage is "+ v +"%");
			}
		});
		frame.getContentPane().add(b1);
		
		JLabel l3 = new JLabel("New label");
		l3.setBounds(24, 11, 211, 212);
		frame.getContentPane().add(l3);
		
		Image img = new ImageIcon(this.getClass().getResource("/mrec.jpg")).getImage();
		l3.setIcon(new ImageIcon(img));
		
		
        
		l4.setBounds(256, 203, 157, 20);
		frame.getContentPane().add(l4);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
