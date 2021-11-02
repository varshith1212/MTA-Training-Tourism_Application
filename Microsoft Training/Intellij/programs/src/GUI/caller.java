package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class caller {
    public static void main(String[] args) {
        call c = new call();
    }
}

class call extends JFrame implements ActionListener{

    JButton b;
    JProgressBar p;
    int i = 0;

    public call(){

        b = new JButton("Add Form");
        p = new JProgressBar(0,20);

        Timer t = new Timer(100, this);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //new registrationForm();
                t.start();
            }
        });

        add(b);
        add(p);

        setTitle("Form");
        //swing code
        setVisible(true);
        setSize(400,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(i==20)
            new registrationForm();
        i++;
        p.setValue(i);
    }
}