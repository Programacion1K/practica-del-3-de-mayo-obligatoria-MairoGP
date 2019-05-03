package GUITest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setLayout(new BorderLayout());
        Container container = new Container();
        container.setLayout(new BorderLayout());

        PanelInfo info = new PanelInfo();
        container.add(info,BorderLayout.EAST);
        JButton button = new JButton("+");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PanelInfo info = new PanelInfo();
                frame.add(info);
            }
        });

        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(container,BorderLayout.WEST);
        container.add(button,BorderLayout.SOUTH);
        frame.pack();
    }
}
