package my.design.factory.abstractfactory.concretefactory;


import my.design.factory.abstractfactory.AbstractSkinFactory;
import my.design.factory.abstractfactory.Button;
import my.design.factory.abstractfactory.ComboBox;
import my.design.factory.abstractfactory.Text;
import my.design.factory.abstractfactory.concreteproduct.button.RedButton;
import my.design.factory.abstractfactory.concreteproduct.combobox.RedComboBox;
import my.design.factory.abstractfactory.concreteproduct.text.RedText;

/**
 * @author bwy
 * @create 2021/7/17 16:11
 */
public class RedStyleFactory  extends AbstractSkinFactory {


    @Override
    public Button createButton() {
        return new RedButton();
    }

    @Override
    public Text createText() {
        return new RedText();
    }

    @Override
    public ComboBox createComboBox() {
        return new RedComboBox();
    }
}
