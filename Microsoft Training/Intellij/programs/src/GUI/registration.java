package GUI;

import javax.swing.*;
import java.awt.*;

public class registration {
    private JButton button1;
    private JPanel panel1;
    private JButton button2;
    private JTabbedPane tabbedPane1;

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        panel1 = new JPanel();
        panel1.setLayout(new GridBagLayout());
        panel1.setAlignmentX(0.0f);
        panel1.setAlignmentY(1.0f);
        panel1.setAutoscrolls(false);
        panel1.setBackground(new Color(-15187672));
        tabbedPane1 = new JTabbedPane();
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.BOTH;
        panel1.add(tabbedPane1, gbc);
        final JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        tabbedPane1.addTab("Untitled", panel2);
        final JLabel label1 = new JLabel();
        label1.setText("Label");
        panel2.add(label1);
        button1 = new JButton();
        button1.setAlignmentY(1.0f);
        button1.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(button1, gbc);
        button2 = new JButton();
        button2.setAlignmentY(1.0f);
        button2.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(button2, gbc);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panel1;
    }
}
