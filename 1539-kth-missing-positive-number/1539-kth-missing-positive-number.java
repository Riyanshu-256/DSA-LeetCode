class Solution {
    public int findKthPositive(int[] arr, int k) {
        // code here

        HashSet<Integer> set = new HashSet<>();

        for(int num : arr){
            set.add(num);
        }

        int count = 0;

        for(int i=1; ; i++){
            if(!set.contains(i)){
                count++;
            }

            if(count == k){
                return i;
            }
        }
    }
}