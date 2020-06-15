package leetcode.jzoffer.review1.day7;

import java.util.Arrays;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/15     13:31
 */
public class LeastNum {
    //利用快排思想
    public int[] getLeastNumbers(int[] arr, int k) {
        if(k==0||arr.length==0) return  new int[0];
        return  quickSort(arr,0,arr.length-1,k-1);
    }
    public  static int[] quickSort(int[] arr,int i ,int j,int k){
             int x = part(arr,i,j);
             if(x==k){
                 return  Arrays.copyOf(arr,k+1);
             }
             return  x>k?quickSort(arr,i,x-1,k):quickSort(arr,x+1,j,k);
    }
    public static  int  part(int[] arr,int i ,int j ){
            int v = arr[i];
            int left = i,right = j;
            while(left<right){
                while(right>i&&arr[right]>v) right--;
                while(left<j&&arr[left]<v) left++;
                if(right<=left) break;
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
            }
            arr[i]= arr[right];
            arr[right]= v;
            return right;
    }

    public static void main(String[] args) {
            quickSort(new int[]{3,2,1},0,2,2);
    }
}
