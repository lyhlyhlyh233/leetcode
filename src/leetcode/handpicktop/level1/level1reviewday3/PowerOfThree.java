package leetcode.handpicktop.level1.level1reviewday3;

public class PowerOfThree {
    // 3 11
    // 9 1001
    // 27 11011
    // 81 1010001
    // 3*3*3*3*3*3
    public boolean isPowerOfThree(int n) {
        if (n < 1) {
            return false;
        }

        while (n % 3 == 0) {
            n /= 3;
        }

        return n == 1;
    }
}
