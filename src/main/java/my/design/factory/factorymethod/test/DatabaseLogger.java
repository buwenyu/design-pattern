package my.design.factory.factorymethod.test;

/**
 * @author bwy
 * @create 2021/7/15 23:15
 */
public class DatabaseLogger implements Logger{
    @Override
    public void writeLog() {
        System.out.println("数据库日志记录");
    }
}
