package leetcode.handpicktop.level1.level1reviewday2;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/4     15:08
 */
public class TheBestTimeToSell {
    //只能有一次交易
    //算出在每一天卖出的最大利润。
    public int maxProfit(int[] prices) {
            if(prices.length < 2) return  0;
            int max = 0;
            int min = prices[0];
            for(int i = 1 ; i < prices.length ; i++){
                int price = prices[i];
                int profile = price - min;
                if(profile>max) max = profile;//更新最大利润
                if(price<min) min = price;
            }
            return  max;
    }
}
