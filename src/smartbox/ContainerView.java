package smartbox;
import mvc.*;

import java.beans.PropertyChangeEvent;
import java.util.Collection;

public class ContainerView extends View {

    private java.awt.List components;

    public ContainerView(Model model) {
        super(model);
        components = new java.awt.List(10);
        this.add(components);
    }

    @Override
    public void update() {
        components.removeAll();
        Container container = (Container)model;
        System.out.println("updated");
        Collection<Component> collection = (container.getComponents());

        for(Component component: collection){
            components.add(component.getClass().getSimpleName());
        }
    }

    // etc.
}
