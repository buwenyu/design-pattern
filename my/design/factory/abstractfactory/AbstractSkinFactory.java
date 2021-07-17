package my.design.factory.abstractfactory;

/**
 * @author bwy
 * @create 2021/7/17 16:06
 */
public abstract class AbstractSkinFactory {
    public abstract Button createButton();
    public abstract Text createText();
    public abstract ComboBox createComboBox();
}
