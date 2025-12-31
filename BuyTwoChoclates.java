

public class BuyTwoChoclates {
    public int buyChoco(int[] prices, int money) {
        /*Arrays.sort(prices);
        int savings = money - (prices[0] + prices[1]);
        if (savings < 0 ) return money;
        return savings;*/

        int maxSavingsFirstPass = Integer.MIN_VALUE;
        int firstBuy = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > money) continue;
            int currentSavings = money - prices[i];
            if (currentSavings > maxSavingsFirstPass) {
                firstBuy = i;
                maxSavingsFirstPass = currentSavings;

            }
        }
        if (maxSavingsFirstPass == Integer.MIN_VALUE) {
            return money;
        }
        int remainingMoney = money - prices[firstBuy];
        if (remainingMoney == 0) return money;
        int maxSavingsSecondPass = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (i == firstBuy) continue;
            if(prices[i]> remainingMoney) continue;

            int currentSavings = remainingMoney - prices[i];
            if (currentSavings > maxSavingsSecondPass) {
                maxSavingsSecondPass = currentSavings;
            }
        }

        if (maxSavingsSecondPass == Integer.MIN_VALUE) {
            return money;
        }

        return maxSavingsSecondPass;


    }
    
}
