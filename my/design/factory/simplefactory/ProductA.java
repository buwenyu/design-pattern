package my.design.factory.simplefactory;

/**
 * @author bwy
 * @create 2021/7/15 17:54
 */
public class ProductA extends Product{
    public ProductA(){
        System.out.println("商品A被生产");
    }
    @Override
    void methodDifferent() {
        System.out.println("这是商品A。。。。。");
    }
}
