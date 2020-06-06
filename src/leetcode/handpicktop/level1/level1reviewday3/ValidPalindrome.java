package leetcode.handpicktop.level1.level1reviewday3;

public class ValidPalindrome {
    //可用双指针，去掉转换字符串的第一步
    public  static  boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]","");
        StringBuffer sb = new StringBuffer(s);
        return  sb.reverse().toString().equals(s);
    }

    public static void main(String[] args) {
        isPalindrome("A man, a plan, a canal: Panama");
    }
}
