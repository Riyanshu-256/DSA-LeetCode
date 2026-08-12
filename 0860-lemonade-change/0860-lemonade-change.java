import java.util.*;

class Solution {
    public boolean lemonadeChange(int[] bills) {

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(5, 0);
        map.put(10, 0);
        map.put(20, 0);

        for (int bill : bills) {

            if (bill == 5) {
                map.put(5, map.get(5) + 1);
            }

            else if (bill == 10) {

                if (map.get(5) == 0)
                    return false;

                map.put(5, map.get(5) - 1);
                map.put(10, map.get(10) + 1);
            }

            else { // bill == 20

                // Prefer 10 + 5
                if (map.get(10) > 0 && map.get(5) > 0) {
                    map.put(10, map.get(10) - 1);
                    map.put(5, map.get(5) - 1);
                }

                // Otherwise give three 5s
                else if (map.get(5) >= 3) {
                    map.put(5, map.get(5) - 3);
                }

                else {
                    return false;
                }

                map.put(20, map.get(20) + 1);
            }
        }

        return true;
    }
}