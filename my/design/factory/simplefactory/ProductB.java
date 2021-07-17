package my.design.factory.simplefactory;

/**
 * @author bwy
 * @create 2021/7/15 17:55
 */
public class ProductB extends Product{
    public ProductB(){
        System.out.println("商品B被生产");
    }
    @Override
    void methodDifferent() {
        System.out.println("这是商品B。。。。。。。。。");
    }
}
