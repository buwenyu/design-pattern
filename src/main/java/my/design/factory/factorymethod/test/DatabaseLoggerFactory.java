package my.design.factory.factorymethod.test;

/**
 * @author bwy
 * @create 2021/7/15 23:16
 */
public class DatabaseLoggerFactory implements LoggerFactory{
    @Override
    public Logger createLogger() {
        /*
         * 连接数据库
         * 。。。
         * 创建数据库日志记录器对象
         * 。。。
         * 初始化数据库日志记录器
         * 。。。
         * @return 返回数据库日志对象
         */
        return new DatabaseLogger();
    }
}
