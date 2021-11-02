package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Radio_buttons {
    public static void main(String[] args) {
        radioButtons r = new radioButtons();
    }
}

class radioButtons extends JFrame implements ActionListener, ItemListener{

    JRadioButton r1,r2;
    JButton b;
    JTextField t;
    JLabel l;
    JCheckBox c1,c2;

    public radioButtons(){
        t = new JTextField(15);
        b = new JButton("ok");
        r1 = new JRadioButton("Male");
        r2 = new JRadioButton("Female");
        l = new JLabel("Greetings");
        c1 = new JCheckBox("Java");
        c2 = new JCheckBox("Python");

        add(t);
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        add(r1);
        add(r2);
        add(c1);
        add(c2);
        add(b);
        add(l);

        c1.addItemListener((ItemListener) this);

        c2.addItemListener((ItemListener) this);

        r1.addActionListener(this);
        r2.addActionListener(this);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = t.getText();
                String language;
                if(r1.isSelected()){
                    name = "Mr."+name;
                }
                else if(r2.isSelected() ){
                    name = "Ms."+name;
                }
                if(c1.isSelected()){
                    language = "Java";
                }
                else
                    language = "Python";
                l.setText(name+" Selected Language "+ language);
            }
        });

        setVisible(true);
        setSize(400,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }


    public void itemStateChanged(ItemEvent e) {

    }
}
