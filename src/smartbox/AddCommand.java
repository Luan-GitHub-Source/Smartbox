package smartbox;

import mvc.Command;
import mvc.Model;
import mvc.Utilities;

public class AddCommand extends Command {
    public AddCommand(Model model) {
        super(model);
    }

    @Override
    public void execute() throws Exception {
        Container container = (Container)model;
        String componentName = Utilities.ask("Component Name?");
        container.addComponent(componentName);
    }
}
