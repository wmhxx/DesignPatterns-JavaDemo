package pattern.strategy;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

/**
 * 策略实现
 *
 * @author :WangMengHe
 * @since :2021-10-15 16:05
 **/
public class StrategyImpl {

    protected static final Map<UserTypeEnum, Consumer<MovieTicket>> MAP =
            new HashMap<UserTypeEnum, Consumer<MovieTicket>>() {{
                //学生的🎫💰
                this.put(UserTypeEnum.STUDENT, StrategyImpl::studentFareCalculation);
                //军人的🎫💰
                this.put(UserTypeEnum.SOLDIER, StrategyImpl::soldierFareCalculation);
                //贵宾的🎫💰
                this.put(UserTypeEnum.VIP, StrategyImpl::vipFareCalculation);
                //默认的🎫💰
                this.put(UserTypeEnum.DEFAULT, StrategyImpl::defaultFareCalculation);
            }};

    /**
     * 学生票价计算
     *
     * @param movieTicket 电影票
     */
    private static void studentFareCalculation(MovieTicket movieTicket) {
        BigDecimal bigDecimal = new BigDecimal("0.85");
        movieTicket.setFareCalculation(movieTicket.getPrice().multiply(bigDecimal).setScale(2, BigDecimal.ROUND_HALF_UP));
    }

    /**
     * 士兵票价计算
     *
     * @param movieTicket 电影票
     */
    private static void soldierFareCalculation(MovieTicket movieTicket) {
        BigDecimal bigDecimal = new BigDecimal("0.5");
        movieTicket.setFareCalculation(movieTicket.getPrice().multiply(bigDecimal).setScale(2, BigDecimal.ROUND_HALF_UP));
    }

    /**
     * 贵宾票计算
     *
     * @param movieTicket 电影票
     */
    private static void vipFareCalculation(MovieTicket movieTicket) {
        BigDecimal bigDecimal = new BigDecimal("0.666");
        movieTicket.setFareCalculation(movieTicket.getPrice().multiply(bigDecimal).setScale(2, BigDecimal.ROUND_HALF_UP));
    }

    /**
     * 默认费用计算
     *
     * @param movieTicket 电影票
     */
    protected static void defaultFareCalculation(MovieTicket movieTicket) {
        BigDecimal bigDecimal = new BigDecimal("1");
        movieTicket.setFareCalculation(movieTicket.getPrice().multiply(bigDecimal).setScale(2, BigDecimal.ROUND_HALF_UP));
    }


}
