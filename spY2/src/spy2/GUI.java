package spy2;

import java.awt.GridLayout;
import javax.swing.*;

public class GUI extends JFrame {

    JButton btn = new JButton("Button");
    JComboBox cb = new JComboBox();

    public GUI() {
        JLabel lblInfo = new JLabel("Testing");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.add(lblInfo);
        panel.add(cb);
        panel.add(btn);
        panel.setLayout(new GridLayout(2, 2));

        getContentPane().add(panel);
        pack();
        setVisible(true);
    }
    public void executeGUI(){
        GUI g = new GUI();
    }
}
