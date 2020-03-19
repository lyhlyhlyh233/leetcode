package leetcode.handpicktop.level1;

/**
 * @Author :   lyh
 * @Dtae :     2020/3/19     11:19
 */

/**
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 *
 * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
 *
 * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 */
//贪心算法  暴力搜索 动态规划
public class BestTimeToBusAndSellStockII {
    private int res;//总利润

    /**
     * 暴力搜索
     * @param prices
     * @return
     */
    public int maxProfit1(int[] prices) {
        int len = prices.length;
        if(len<2){
            return 0;
        }
        this.res = 0 ;
        dfs(prices,0,len,0,res);
        return this.res;
    }

    /**
     *
     * @param prices
     * @param index
     * @param len
     * @param status 0表示不持有股票 1表示持有股票
     * @param profit
     */
    public void dfs(int[] prices , int index, int len, int status, int profit){
            if(index == len){
                this.res = Math.max(this.res,profit);
                return;
            }
            //保持现状
        dfs(prices,index+1,len,status,profit);
            //状态改变
        if(status==0)
            dfs(prices,index+1,len,1,profit - prices[index]);
        else
            dfs(prices,index+1,len,0,profit + prices[index]);
    }

    /**
     *  贪心算法
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices){
        int diff = 0;
        for(int i = 0 ; i < prices.length-1; i ++){
            if(prices[i+1]>prices[i]){
                diff+= prices[i+1] - prices[i];
            }
        }
        return  diff;
    }

}
