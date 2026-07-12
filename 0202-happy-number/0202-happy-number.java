import java.util.*;

class Solution {

    public boolean isHappy(int n) {
        // code here

        HashSet<Integer> set = new HashSet<>();

        while(n != 1 && !set.contains(n)) {

            set.add(n);

            int sum = 0;

            // sum of the sq of digits
            while(n > 0) {

                int digit = n % 10;

                sum += digit * digit;

                n = n / 10;
            }

            n = sum;
        }

        return n == 1;
    }
}