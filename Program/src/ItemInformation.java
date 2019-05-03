import com.sun.javafx.robot.impl.FXRobotHelper;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ItemInformation {
    private final Contact owner;
    private List<String> dato;

    public ItemInformation(Contact owner) {
        this.owner = owner;
        this.dato = new ArrayList<>();
    }

    public void addInfo() {

        JFrame frame = new JFrame();
        Container container = new Container();

        container.setLayout(new FlowLayout());

        container.add(new JLabel("Info: "));
        container.add(new JTextField(20));


        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(container);
        frame.pack();
    }
}
