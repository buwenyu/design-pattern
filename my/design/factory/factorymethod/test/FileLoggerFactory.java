package my.design.factory.factorymethod.test;

/**
 * @author bwy
 * @create 2021/7/15 23:19
 */
public class FileLoggerFactory implements LoggerFactory{
    @Override
    public Logger createLogger() {
        return new FileLogger();
    }
}
