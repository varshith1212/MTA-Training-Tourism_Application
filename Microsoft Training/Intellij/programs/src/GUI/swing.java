package GUI;

import javax.swing.*;
import java.awt.*;

public class swing {
    public static void main(String[] args) {
        Abc a = new Abc();
        a.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}

class Abc extends JFrame{
    public Abc(){
        setLayout(new FlowLayout());
        JLabel label = new JLabel("Hellloooo");
        JLabel label2 = new JLabel("Friendssss");
        add(label);
        add(label2);
        JButton b = new JButton();
        b.setSize(400,400);
        add(b);
        setVisible(true);
        setSize(400,400);
    }
}