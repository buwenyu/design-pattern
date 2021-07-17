package my.design.factory.factorymethod.test.xml;

import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * @author bwy
 * @create 2021/7/15 23:23
 */
public class XMLUtils {
    public static String getFactoryName() throws ParserConfigurationException, IOException, SAXException {
        return DocumentBuilderFactory.newInstance().newDocumentBuilder()
                .parse("src\\main\\java\\my\\design\\factory\\factorymethod\\test\\xml\\config.xml")
                .getElementsByTagName("factoryName")
                .item(0).getFirstChild()
                .getNodeValue();
    }

    public static String getLoggerName() throws ParserConfigurationException, IOException, SAXException {
        return DocumentBuilderFactory.newInstance().newDocumentBuilder()
                .parse("src\\main\\java\\my\\design\\factory\\factorymethod\\test\\xml\\config.xml")
                .getElementsByTagName("loggerName").item(0).getTextContent().trim();
    }

}
