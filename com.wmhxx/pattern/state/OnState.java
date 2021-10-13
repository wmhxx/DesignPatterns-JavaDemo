package pattern.state;

/**
 * 打开状态
 *
 * @author :WangMengHe
 * @since :2021-10-13 11:32
 **/
public class OnState extends State {

    @Override
    public void on(Switch s) {
        System.out.println("已经打开！");
    }

    @Override
    public void off(Switch s) {
        System.out.println("关闭！");
        s.setState(Switch.getState("off"));
    }
}

