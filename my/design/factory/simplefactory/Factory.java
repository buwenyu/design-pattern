package my.design.factory.simplefactory;


import my.design.factory.simplefactory.xml.XMLUtil;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * @author bwy
 * @create 2021/7/15 6:13
 */
public class Factory {
//     static Product produce(Class<? extends Product> className){
//        if ("ProductA".equals(className.getSimpleName())){
//            return new ProductA();
//        }else if("ProductB".equals(className.getSimpleName())) {
//            return new ProductB();
//        }else {
//            System.out.println("错误。。。");
//        }
//        return null;
//    }
    static Product produce(String type){
        switch (type){
            case "A":
                return new ProductA();
            case "B":
                return new ProductB();
            default:
                return null;
        }
    }

    //    public static void main(String[] args) {
//        Product product = Factory.produce(ProductB.class);
//        product.methodDifferent();
//        product.methodSame();
//    }
    public static void main(String[] args) {
        try {
            Product product = produce(XMLUtil.getType());
            product.methodSame();
            product.methodDifferent();
        } catch (ParserConfigurationException | IOException | SAXException e) {
            e.printStackTrace();
        }
    }
}
