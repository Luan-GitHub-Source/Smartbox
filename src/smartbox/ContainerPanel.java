package smartbox;
import java.awt.GridLayout;
import java.beans.PropertyChangeEvent;

import javax.swing.*;
import mvc.*;

public class ContainerPanel extends AppPanel {
    java.awt.List components;
    public ContainerPanel(AppFactory factory) {
        super(factory);
        // set up controls
        JButton add = new JButton("Add");
        add.addActionListener(this);
        JButton rem = new JButton("Rem");
        rem.addActionListener(this);
        JButton run = new JButton("Run");
        run.addActionListener(this);

        controlPanel.add(add);
        controlPanel.add(rem);
        controlPanel.add(run);
    }

    // this override needed to re-initialize component fields table:
    public void setModel(Model m) {
        super.setModel(m);
        ((Container) m).initContainer(); // restore fields of smartbox.components
    }

    public static void main(String[] args) {
        AppPanel panel = new ContainerPanel(new ContainerFactory());
        panel.display();
    }
}