package pattern.observer;

/**
 * 具体战队控制中心类：具体目标类
 *
 * @author :WangMengHe
 * @since :2021-10-08 17:44
 **/
public class ConcreteAllyControlCenter extends AbstractAllyControlCenter {

    /**
     * 具体的盟友控制中心
     *
     * @param allyName 盟友的名字
     */
    public ConcreteAllyControlCenter(String allyName) {
        System.out.println(allyName + "战队组建成功！");
        System.out.println("----------------------------");
        this.allyName = allyName;
    }

    /**
     * 实现通知方法
     *
     * @param name 姓名
     */
    @Override
    public void notifyObserver(String name) {
        System.out.println(this.allyName + "战队紧急通知，盟友" + name + "遭受敌人攻击！");
        //遍历观察者集合，调用每一个盟友（自己除外）的支援方法
        for(Observer obs : players) {
            if (!obs.getName().equalsIgnoreCase(name)) {
                obs.help();
            }
        }
    }

}
