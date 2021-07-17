package my.design.factory.factorymethod.test;

import my.design.factory.factorymethod.test.xml.XMLUtils;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * @author bwy
 * @create 2021/7/15 23:20
 */
public class Client {


    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
//        LoggerFactory databaseLoggerFactory = new DatabaseLoggerFactory();
//        Logger logger = databaseLoggerFactory.createLogger();
//        logger.writeLog();

        String factoryName = XMLUtils.getFactoryName();
        String loggerName = XMLUtils.getLoggerName();

    }
}

