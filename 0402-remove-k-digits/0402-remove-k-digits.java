class Solution {
    public String removeKdigits(String num, int k) {

        int n = num.length();
        char[] arr = num.toCharArray();

        int size = 0;

        for (int i = 0; i < n; i++) {

            while (size > 0 && k > 0 && arr[size - 1] > arr[i]) {
                size--;
                k--;
            }

            arr[size] = arr[i];
            size++;
        }

        // Agar k abhi bhi bacha hai
        size = size - k;

        // Leading zero remove
        int i = 0;

        while (i < size - 1 && arr[i] == '0') {
            i++;
        }

        if (i >= size) {
            return "0";
        }

        return new String(arr, i, size - i);
    }
}