package my.design.factory.factorymethod;

/**
 * @author bwy
 * @create 2021/7/15 23:02
 */
public class Product2 implements Product{
    Product2(){
        System.out.println("开始生产2");
    }
    @Override
    public void factoryMethod() {
        System.out.println("Product2被生产。。。。。。。。。");
    }
}
