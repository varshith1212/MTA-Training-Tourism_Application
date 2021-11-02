package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator_Swing {
    public static void main(String[] args) {
        calculator a = new calculator();
    }
}

class calculator extends JFrame implements ActionListener {

    JTextField t1,t2;
    JButton addt,sub,mul,div;
    JLabel l;

    public calculator(){
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        addt = new JButton("Add");
        sub = new JButton("Sub");
        mul = new JButton("Multiply");
        div = new JButton("Division");
        l =new JLabel("Result");

        add(t1);
        add(t2);
        add(addt);
        add(sub);
        add(mul);
        add(div);
        add(l);

        addt.addActionListener(this);//It is an interface.
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        setVisible(true);
        setSize(400,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent e) {

        int n1 = Integer.parseInt(t1.getText());
        int n2 = Integer.parseInt(t2.getText());

        int value = 0;
        if(e.getSource()==addt) {
            value = n1 + n2;
        }
        else if(e.getSource()==sub){
            value = n1-n2;
        }
        else if(e.getSource()==mul){
            value = n1*n2;
        }
        else if(e.getSource()==div){
            value = n1/n2;
        }
        l.setText(value+"");
    }
}
