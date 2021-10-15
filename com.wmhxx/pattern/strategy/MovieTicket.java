package pattern.strategy;

import java.math.BigDecimal;

/**
 * 电影票
 * 设计模式-策略模式  实现一种新思路去实现策略模式
 *
 * @author WangMengHe
 * @date 2021/10/15
 * @since :2021-10-15 15:58
 */
public class MovieTicket {

    /**
     * 电影票价格
     */
    private BigDecimal price;

    /**
     * 票价计算
     */
    private BigDecimal fareCalculation;


    public BigDecimal getFareCalculation() {
        return fareCalculation;
    }

    public void setFareCalculation(BigDecimal fareCalculation) {
        this.fareCalculation = fareCalculation;
    }


    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "MovieTicket{" +
                "price=" + price +
                ", fareCalculation=" + fareCalculation +
                '}';
    }
}
