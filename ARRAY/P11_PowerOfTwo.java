package ARRAY;

public class P11_PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if(n==1) return true;  // power(2, 0) = 1
        if(n <= 0 || n % 2 != 0) return false;

        return isPowerOfTwo(n/2);
    }
}
