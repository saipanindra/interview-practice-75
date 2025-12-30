
import java.util.Arrays;

public class BuyTwoChoclates {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int savings = money - (prices[0] + prices[1]);
        if (savings < 0 ) return money;
        return savings;
    }
    
}
