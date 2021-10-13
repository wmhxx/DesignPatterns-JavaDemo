package pattern.state;

/**
 * 关闭状态
 *
 * @author :WangMengHe
 * @since :2021-10-13 11:33
 **/
public class OffState extends State {

    @Override
    public void on(Switch s) {
        System.out.println("打开！");
        s.setState(Switch.getState("on"));
    }

    @Override
    public void off(Switch s) {
        System.out.println("已经关闭！");
    }
}