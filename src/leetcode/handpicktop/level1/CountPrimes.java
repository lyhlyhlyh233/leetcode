package leetcode.handpicktop.level1;

/**
 * @Author :   lyh
 * @Dtae :     2020/3/27     17:26
 */

/**
 * 统计所有小于非负整数 n 的质数的数量。
 */
public class CountPrimes {
    /**
     * 判断该整数是否是质数: 只能被1和自己整除
     * @param n
     * @return
     */
    public static boolean isPrimes(int n){
        if(n<2) return  false;
        for(int i = 2 ; i * i < n ;i++){
            if(n%i==0)
                return  false;
        }
        return  true;
    }
    public static int countPrimes(int n) {
            boolean[] isP = new boolean[n];
            for(int m = 0 ; m < n ;m++){
                isP[m] = true;
              }
            int count =0;
            for(int i = 0 ; i < n ; i++){
                if(isP[i]){
                    if(isPrimes(i)){
                        isP[i]=true;
                        for(int k=2 ;  ; k++){
                            int j = k*i;
                            if(!(j<n)) break;
                            isP[j] = false;
                        }
                    }
                    else   isP[i] = false;
                }
            }
            for(int x = 0 ; x<n;x++){
                if(isP[x]) count++;
            }
            return  count;
    }

    public static void main(String[] args) {
        System.out.println(countPrimes(10));
    }
}
