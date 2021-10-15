package pattern.state;

/**
 * 客户端测试-状态模式
 *
 * @author :WangMengHe
 * @since :2021-10-13 11:30
 **/
public abstract class State {

    /**
     * 开
     *
     * @param s 转换
     */
    public abstract void on(Switch s);

    /**
     * 关
     *
     * @param s 转换
     */
    public abstract void off(Switch s);
}
