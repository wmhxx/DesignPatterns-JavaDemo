package observer;

import java.util.Scanner;

/**
 * 客户端测试
 * @author :WangMengHe
 * @since :2021-10-08 17:45
 **/
public class Client_Main {

    public static void main(String[] args) {
        //定义观察目标对象
        System.out.println("请设置一个威风的联盟名称吧～");
        Scanner scanner = new Scanner(System.in);
        AllyControlCenter acc = new ConcreteAllyControlCenter(scanner.next());
        //定义四个观察者对象
        Observer player1,player2,player3,player4;
        player1 = new Player("杨过");
        acc.join(player1);
        player2 = new Player("令狐冲");
        acc.join(player2);
        player3 = new Player("张无忌");
        acc.join(player3);
        player4 = new Player("段誉");
        acc.join(player4);
        System.out.println("----------------------------");
        //某成员遭受攻击
        player1.beAttacked(acc);
    }
}
