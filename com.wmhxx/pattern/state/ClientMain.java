package pattern.state;

/**
 * @author :WangMengHe
 * @since :2021-10-13 11:35
 **/
public class ClientMain {

    public static void main(String[] args) {
        Switch s1, s2;
        s1 = new Switch("开关1");
        s2 = new Switch("开关2");
        s1.on();
        s2.on();
        s1.off();
        s2.off();
        s2.on();
        s1.on();
        s2.off();
        s1.off();
    }

}
