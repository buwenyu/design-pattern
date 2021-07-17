package my.design.factory.abstractfactory.concreteproduct.button;

import my.design.factory.abstractfactory.Button;

/**
 * @author bwy
 * @create 2021/7/17 16:13
 */
public class BlueButton implements Button {
    @Override
    public void displayButton() {
        System.out.println("蓝色按钮。。。");
    }
}
