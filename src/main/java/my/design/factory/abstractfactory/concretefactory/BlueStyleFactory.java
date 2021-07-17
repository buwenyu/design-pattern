package my.design.factory.abstractfactory.concretefactory;

import my.design.factory.abstractfactory.AbstractSkinFactory;
import my.design.factory.abstractfactory.Button;
import my.design.factory.abstractfactory.ComboBox;
import my.design.factory.abstractfactory.Text;
import my.design.factory.abstractfactory.concreteproduct.button.BlueButton;
import my.design.factory.abstractfactory.concreteproduct.combobox.BlueComboBox;
import my.design.factory.abstractfactory.concreteproduct.text.BlueText;

/**
 * @author bwy
 * @create 2021/7/17 16:23
 */
public class BlueStyleFactory extends AbstractSkinFactory {
    @Override
    public Button createButton() {
        return new BlueButton();
    }

    @Override
    public Text createText() {
        return new BlueText();
    }

    @Override
    public ComboBox createComboBox() {
        return new BlueComboBox();
    }

}
