package GUITest;

import javax.swing.*;
import java.awt.*;

public class PanelInfo extends JPanel {
    private String content;
    JLabel info = new JLabel("Info: ");
    JTextArea in = new JTextArea(5,18);

    PanelInfo(){
        add(info);
        add(in);
        content = in.getText();
        setLayout(new FlowLayout());
        setVisible(true);
    }
}
