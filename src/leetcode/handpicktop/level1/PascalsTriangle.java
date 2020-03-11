package leetcode.handpicktop.level1;

/**
 * @Author :   lyh
 * @Dtae :     2020/3/11     11:10
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 */
public class PascalsTriangle {
    public List<List<Integer>> result;
    //构建第N层，从0开始
    public void triangle(int n ){
         List<Integer> list = new ArrayList<>();
         for(int i =0;i<=n;i++){//每层都有n+1个数
             if(i==0||i==n){
                 list.add(1);
                 continue;
             }
             List<Integer>  top =      result.get(n-1);//上一级
             list.add(top.get(i-1)+top.get(i));
         }
         result.add(list);
    }
    public List<List<Integer>> generate(int numRows) {
            result = new ArrayList<>();
            for(int i = 0 ; i < numRows;i++ ){
                 triangle(i);
            }
            return  result;
    }
}
