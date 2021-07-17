package my.design.factory.abstractfactory.concreteproduct.combobox;

import my.design.factory.abstractfactory.ComboBox;

/**
 * @author bwy
 * @create 2021/7/17 16:18
 */
public class BlueComboBox implements ComboBox {
    @Override
    public void displayComboBox() {
        System.out.println("蓝色组合...");
    }
}
