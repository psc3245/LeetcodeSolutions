package Medium.Course_Schedule_207;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        List<Integer>[] adjlist = new ArrayList[numCourses];
        for (int i = 0; i < numCourses; i++) {
            adjlist[i] = (new ArrayList<>());
        }
        for (int[] arr : prerequisites) {
            adjlist[arr[0]].add(arr[1]);
        }
        HashSet<Integer> path = new HashSet<>();
        boolean[] visited = new boolean[numCourses];

        for (int i = 0; i < adjlist.length; i++) {

            if (dfs(i, path, adjlist, visited)) {
                return false;
            }
        }

        return true;
    }

    public boolean dfs(int node, HashSet<Integer> path, List<Integer>[] adjlist, boolean[] visited) {
        if (path.contains(node)) return true;
        if (visited[node]) return false;

        path.add(node);

        for (int next : adjlist[node]) {
            if (dfs(next, path, adjlist, visited)) {
                return true;
            }
        }

        path.remove(node);
        visited[node] = true;

        return false;
    }
}
