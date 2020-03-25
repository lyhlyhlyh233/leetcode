package leetcode.handpicktop.level1;

/**
 * @Author :   lyh
 * @Dtae :     2020/3/23     10:24
 */

import java.util.ArrayList;

/**
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 *
 * 如果你最多只允许完成一笔交易（即买入和卖出一支股票一次），设计一个算法来计算你所能获取的最大利润。
 *
 * 注意：你不能在买入股票前卖出股票。
 */

public class BestTimeToBuyAndSellStock {
    //暴力搜索
    public  int maxProfit(int[] prices) {
        int len = prices.length;
        int max = 0;
        for(int i = 0 ; i < len ; i++){
            for(int j = i +1 ; j < len ; j++){
                     int temp = 0;
                    if(prices[j]>prices[i]){
                        temp = prices[j]-prices[i];
                        if(temp>max) max = temp;
                    }
            }
        }
        return  max;
    }
    public int maxProfit1(int[] prices){
            int len = prices.length;
            if(len==0) return  0;
            int low = prices[0];
            int max = 0;
            for(int i = 1 ; i  < len ; i++){
                    int p = prices[i]-low;
                    if(p>max) max= p;
                    if(prices[i]<low) low =prices[i];
            }
            return  max;
    }
}
