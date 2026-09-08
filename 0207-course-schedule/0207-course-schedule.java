class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // code here

        // Create adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0; i<numCourses; i++){
            adj.add(new ArrayList<>());
        }

        // Create indegree array
        int[] indegree = new int[numCourses];

        // Build graph
        for(int[] pair : prerequisites ){
            int course = pair[0];
            int prerequisite = pair[1];

            adj.get(prerequisite).add(course);

            indegree[course]++;
        }

        Queue<Integer> q = new LinkedList<>();

        for(int i=0; i<numCourses; i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }

        // Topological Sort
        int count = 0;

        while (!q.isEmpty()) {

            int course = q.poll();
            count++;

            for (int neighbor : adj.get(course)) {

                indegree[neighbor]--;

                if (indegree[neighbor] == 0) {
                    q.add(neighbor);
                }
            }
        }

        // If all courses processed and no cycle contain
        return count == numCourses;
    }
}