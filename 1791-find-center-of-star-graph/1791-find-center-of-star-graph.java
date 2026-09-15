// class Solution {
//     public int findCenter(int[][] edges) {
//         // code here

//         if (edges[0][0] == edges[1][0] ||
//             edges[0][0] == edges[1][1]) {
//             return edges[0][0];
//         }

//         return edges[0][1];
//     }
// }


class Solution {
    public int findCenter(int[][] edges) {
        // code here

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int[] edge : edges){
            map.put(edge[0], map.getOrDefault(edge[0], 0)+1);
            map.put(edge[1], map.getOrDefault(edge[1], 0)+1);

        }

        int n = edges.length;

        for(int  node : map.keySet()){
            if(map.get(node) == n){
                return node;
            }
        }
        return -1;
    }
}