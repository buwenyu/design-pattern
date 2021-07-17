package my.design.factory.factorymethod.test;

/**
 * @author bwy
 * @create 2021/7/15 23:15
 */
public class FileLogger implements Logger{
    @Override
    public void writeLog() {
        System.out.println("文件日志记录");
    }
}
