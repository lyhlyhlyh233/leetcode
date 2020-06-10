package leetcode.jzoffer.review1.day3;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/10     13:46
 */
public class StringMatch {
    /**
     * 完成匹配，动态规划
     * @param s
     * @param p
     * @return
     */
    public boolean isMatch(String s, String p) {
        //1定义结构 dp[i][j]  s的前i个与p的前j个是否能匹配
        //2公式
        //dp[i][j] = dp[i-1][j-1]  when s[i] = p[j] or p[j] = '.'
         //            = dp[i][j-2]      when p[j] = '*'  and s[i]!=p[i-1] and s[i]!='.'
        //             =  dp[i-1][j-2] or dp[i-1][j]          when p[j] = '*' and (s[i]==p[i-1] or s[i] = '.')
        //             =  false   , else
        //3,初始值 dp[0][0] =true;//两空串 可能是空值，可能是
        int m = s.length()+1,n=p.length()+1;
        int[][] dp = new int[m][n];
        //特殊处理   有空串的情况
        dp[0][0] = 1;
        for(int i = 2; i<=p.length();i++){
            if(p.charAt(i-1)=='*'){
                dp[0][i] = dp[0][i-2];
            }
        }
        //遍历  i j 代表前多少个
        for(int i = 1; i < (s.length()+1) ; i++ ){
            for(int j = 1; j <  (p.length()+1);j++){
                //最后一个为*
                if(p.charAt(j-1)=='*'){
                    //0次或多次
                    if(s.charAt(i-1)==p.charAt(j-2)||p.charAt(j-2)=='.'){
                        dp[i][j] = dp[i-1][j] | dp[i][j-2];
                    }
                    else{
                        dp[i][j] = dp[i][j-2];
                    }
                }
                else{
                    if(s.charAt(i-1)==p.charAt(j-1)||p.charAt(j-1)=='.'){
                        dp[i][j] = dp[i-1][j-1];
                    }
                }
            }
        }
        return  dp[s.length()][p.length()]==1;
    }
}
