package ARRAY;

public class P12_PowerOfThree {
    public boolean isPowerOfThree(int n) {
        if(n==1) return true;  // power(3, 0) = 1
        if(n <= 0 || n % 3 != 0) return false;

        return isPowerOfThree(n/3);
    }
}
