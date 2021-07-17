package my.design.factory.factorymethod;

/**
 * @author bwy
 * @create 2021/7/15 23:06
 */
public class FactoryB implements Factory{
    @Override
    public Product getProduct() {
        return new Product2();
    }
}
