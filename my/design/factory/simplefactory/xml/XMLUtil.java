package my.design.factory.simplefactory.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * @author bwy
 * @create 2021/7/15 21:44
 */
public class XMLUtil {


    //该方法用于从xml文件中读取信息
    public static String getType() throws ParserConfigurationException, IOException, SAXException {
//        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
//        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
//        Document document;
//        document = documentBuilder.parse(new File("src\\main\\java\\my\\design\\simplefactory\\xml\\config.xml"));
        Document document = DocumentBuilderFactory.newInstance()
                                                    .newDocumentBuilder()
                                                    .parse(new File("src\\main\\java\\my\\design\\simplefactory\\xml\\config.xml"));

        NodeList nodeList = document.getElementsByTagName("queryType");
        Node classNode = nodeList.item(0).getFirstChild();
        String type = classNode.getNodeValue().trim();
        return type;
    }
}
