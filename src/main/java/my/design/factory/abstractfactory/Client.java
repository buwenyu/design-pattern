package my.design.factory.abstractfactory;

import my.design.factory.abstractfactory.concretefactory.BlueStyleFactory;
import my.design.factory.abstractfactory.concretefactory.RedStyleFactory;

/**
 * @author bwy
 * @create 2021/7/17 16:24
 */
public class Client {
    public static void main(String[] args) {
        AbstractSkinFactory abstractSkinFactory = new RedStyleFactory();
        Button button = abstractSkinFactory.createButton();
        button.displayButton();
        Text text = abstractSkinFactory.createText();
        text.displayText();
        ComboBox comboBox = abstractSkinFactory.createComboBox();
        comboBox.displayComboBox();
    }
}
