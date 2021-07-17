package my.design.factory.abstractfactory.concreteproduct.text;

import my.design.factory.abstractfactory.Text;

/**
 * @author bwy
 * @create 2021/7/17 16:17
 */
public class BlueText implements Text {
    @Override
    public void displayText() {
        System.out.println("蓝色文本框...");
    }
}
