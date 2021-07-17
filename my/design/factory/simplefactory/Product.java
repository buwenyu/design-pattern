package my.design.factory.simplefactory;

/**
 * @author bwy
 * @create 2021/7/15 17:52
 */
public abstract class Product {
    void methodSame(){
        System.out.println("这是一个商品====");
    }

    /**
     * 个性方法
     */
    abstract void methodDifferent();
}
