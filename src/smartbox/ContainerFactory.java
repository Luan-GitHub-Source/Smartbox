package smartbox;

import mvc.*;

public class ContainerFactory implements AppFactory {
    public Model makeModel() { return new Container();}

    public View makeView(Model model) {
        return new ContainerView((Container) model);
    }

    public String getTitle() { return "Smartbox"; }

    public String[] getHelp() {
        return new String[]{"Help"};
    }

    public String about() {
        return "About";
    }

    public String[] getEditCommands() {
        return new String[] {"Add", "Rem", "Run"};
    }

    public Command makeEditCommand(Model model, String type, Object source) {
        return switch (type) {
            case "Add" -> new AddCommand(model);
            case "Rem" -> new RemCommand(model);
            case "Run" -> new RunCommand(model);
            default -> null;
        };
    }
}
