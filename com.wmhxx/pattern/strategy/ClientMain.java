package pattern.strategy;

import java.math.BigDecimal;

/**
 * 设计模式之策略模式
 * 本例根据枚举获取匿名函数在调用方法实现策略模式
 *
 * @author :WangMengHe
 * @since :2021-10-15 16:16
 **/
public class ClientMain {

    public static void main(String[] args) {
        System.out.println("-----------------------------获取全部的折扣🎫-----------------------------");
        MovieTicket movieTicket = new MovieTicket();
        //设置原始价格为
        movieTicket.setPrice(new BigDecimal("200"));
        StrategyImpl.MAP.forEach((k, v) -> {
            v.accept(movieTicket);
            System.out.println(movieTicket);
        });

        System.out.println("-----------------------------枚举为空，返回默认🎫-----------------------------");
        StrategyImpl.MAP.getOrDefault(null, StrategyImpl::defaultFareCalculation).accept(movieTicket);
        System.out.println(movieTicket);
        System.out.println("-----------------------------获取单条的折扣🎫-----------------------------");
        StrategyImpl.MAP.get(UserTypeEnum.VIP).accept(movieTicket);
        System.out.println(movieTicket);
    }
}
