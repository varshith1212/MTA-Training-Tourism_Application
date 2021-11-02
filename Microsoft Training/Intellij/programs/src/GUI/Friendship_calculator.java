package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Friendship_calculator {
    public static void main(String[] args) {
        friendshipCalculator a = new friendshipCalculator();
    }

}

class friendshipCalculator extends JFrame implements ActionListener{

    JTextField t1,t2;
    JButton b;
    JLabel l;

    public friendshipCalculator(){
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        b = new JButton("Submit");
        l = new JLabel();

        add(t1);
        add(t2);
        add(b);
        add(l);

        b.addActionListener(this);

        setVisible(true);
        setSize(400,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {

        String s1 = t1.getText();
        String s2 = t2.getText();

        Random r = new Random();
        int v = r.nextInt(100);

        l.setText("Hello " + s1 + " and "+s2+" Your friendship percentage is:"+v+"%");
    }
}