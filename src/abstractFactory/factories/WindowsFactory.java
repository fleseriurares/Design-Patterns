package abstractFactory.factories;

import abstractFactory.buttons.Button;
import abstractFactory.buttons.WindowsButton;
import abstractFactory.checkboxes.Checkbox;
import abstractFactory.checkboxes.WindowsChecbox;

public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton()
    {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox()
    {
        return new WindowsChecbox();
    }

}
