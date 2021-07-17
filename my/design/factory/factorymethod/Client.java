package my.design.factory.factorymethod;

/**
 * @author bwy
 * @create 2021/7/15 23:07
 */
public class Client {
    public static void main(String[] args) {
        Factory factory = new FactoryA();
        Product product = factory.getProduct();
        product.factoryMethod();
    }
}
