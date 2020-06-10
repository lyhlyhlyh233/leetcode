package leetcode.jzoffer.review1.day3;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/10     9:55
 */
public class OneInBinaryNum {
    public int hammingWeight(int n) {
            int sum = 0;
            while(n!=0){
                    sum+=1;
                    n = n&(n-1);
            }
            return  sum;
    }
}
