package my.design.factory.factorymethod;

/**
 * @author bwy
 * @create 2021/7/15 22:59
 */
public class Product1 implements Product{
    Product1(){
        System.out.println("开始生产1");
    }
    @Override
    public void factoryMethod() {
        System.out.println("Product1被生产。");
    }
}
