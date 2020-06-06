package leetcode.handpicktop.level1.level1reviewday3;

public class ValidPalindrome {
    public  static  boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z]|[^0-9]","");
        int i = 0 , j = s.length();
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            else {
                i++;j--;
            }
        }
        return  true;
    }

    public static void main(String[] args) {
        isPalindrome("race a car");
    }
}
