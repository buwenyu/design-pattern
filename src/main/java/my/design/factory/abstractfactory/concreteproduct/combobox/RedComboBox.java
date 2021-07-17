package my.design.factory.abstractfactory.concreteproduct.combobox;

import my.design.factory.abstractfactory.ComboBox;

/**
 * @author bwy
 * @create 2021/7/17 16:17
 */
public class RedComboBox implements ComboBox {
    @Override
    public void displayComboBox() {
        System.out.println("红色组合。。。");
    }
}
