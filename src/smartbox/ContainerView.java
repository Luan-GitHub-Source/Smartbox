package smartbox;
import mvc.*;

import java.beans.PropertyChangeEvent;

public class ContainerView extends View {

    private java.awt.List components;

    public ContainerView(Model model) {
        super(model);
        components = new java.awt.List(10);
        this.add(components);
    }

    @Override
    public void update() {
        Container container = (Container)model;
        System.out.println("updated");
        System.out.println(container.getComponents());
    }

    // etc.
}
