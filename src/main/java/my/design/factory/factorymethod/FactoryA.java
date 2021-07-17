package my.design.factory.factorymethod;

/**
 * @author bwy
 * @create 2021/7/15 23:04
 */
public class FactoryA implements Factory{
    @Override
    public Product getProduct() {
        return new Product1();
    }
}
