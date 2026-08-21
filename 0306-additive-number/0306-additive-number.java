import java.math.BigInteger;

class Solution {

    public boolean isAdditiveNumber(String num) {

        int n = num.length();

        for (int i = 1; i <= n / 2; i++) {

            // leading zero
            if (num.charAt(0) == '0' && i > 1) {
                break;
            }

            BigInteger first =
                new BigInteger(num.substring(0, i));

            for (int j = i + 1; j < n; j++) {

                // leading zero
                if (num.charAt(i) == '0' && j - i > 1) {
                    break;
                }

                BigInteger second =
                    new BigInteger(num.substring(i, j));

                if (check(num, j, first, second)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean check(String num, int index,
                          BigInteger first,
                          BigInteger second) {

        int count = 2;

        while (index < num.length()) {

            BigInteger sum = first.add(second);

            String s = sum.toString();

            if (!num.startsWith(s, index)) {
                return false;
            }

            index += s.length();

            first = second;
            second = sum;

            count++;
        }

        return count >= 3;
    }
}