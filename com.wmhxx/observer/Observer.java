package observer;

/**
 * 抽象观察类
 * @author :WangMengHe
 * @since :2021-10-08 17:41
 **/
public interface Observer {

    String getName();

    void setName(String name);

    /**
     * 声明支援盟友方法
     */
    void help();

    /**
     * 声明遭受攻击方法
     * @param acc 战队控制中心
     */
    void beAttacked(AllyControlCenter acc);

}
