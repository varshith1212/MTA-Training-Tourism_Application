package GUI;

import javax.swing.*;
import java.awt.*;

public class arrange_components {
    public static void main(String[] args) {
        JFrame f =new JFrame();

        f.setVisible(true);
        f.setSize(400,400);
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p = new JPanel(new GridBagLayout());

        JButton b1 = new JButton("Hello");
        JButton b2 = new JButton("Hello");

        GridBagConstraints g = new GridBagConstraints();

        g.insets = new Insets(10,10,10,10);

        g.gridx = 0;
        g.gridy = 1;
        p.add(b1,g);

        g.gridx = 0;
        g.gridy = 2;
        p.add(b2,g);

        f.add(p);
    }
}
