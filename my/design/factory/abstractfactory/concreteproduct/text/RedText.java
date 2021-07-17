package my.design.factory.abstractfactory.concreteproduct.text;

import my.design.factory.abstractfactory.Text;

/**
 * @author bwy
 * @create 2021/7/17 16:16
 */
public class RedText implements Text {
    @Override
    public void displayText() {
        System.out.println("红色文本框。。。");
    }
}
