package leetcode.handpicktop.level1.level1reviewday1;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/3     15:48
 */
public class TheBestTimeToSell {
    //升值就 买 卖
    public int maxProfit(int[] prices) {
            int total = 0;
            for(int i = 0 ; i < prices.length-1 ; i++){
                  if(prices[i]<prices[i+1]){
                      total += (prices[i+1]-prices[i]);
                  }
            }
            return  total;
    }
}
