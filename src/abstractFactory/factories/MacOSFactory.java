package abstractFactory.factories;

import abstractFactory.buttons.Button;
import abstractFactory.buttons.MacOSButton;
import abstractFactory.checkboxes.MacOSCheckbox;
import abstractFactory.checkboxes.Checkbox;

public class MacOSFactory implements GUIFactory{

    @Override
    public Button createButton()
    {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox()
    {
        return new MacOSCheckbox();
    }
}
