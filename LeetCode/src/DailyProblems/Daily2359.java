package DailyProblems;

import java.util.Arrays;

/**
 * 2359. Find Closet Node to Given Two Nodes
 */

class Solution2359 {
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        int n = edges.length;
        int[] dist1 = getDistance(edges, node1);
        int[] dist2 = getDistance(edges, node2);

        int res = -1;
        for (int i = 0; i < n; ++i) {
            if (dist1[i] != -1 && dist2[i] != -1) {
                if (res == -1 || Math.max(dist1[i], dist2[i]) < Math.max(dist1[res], dist2[res])) {
                    res = i;
                }
            }
        }
        return res;
    }

    private int[] getDistance(int[] edges, int node) {
        int n = edges.length;
        int[] dist = new int[n];
        Arrays.fill(dist, -1);
        int distance = 0;
        while (node != -1 && dist[node] == -1) {
            dist[node] = distance++;
            node = edges[node];
        }
        return dist;
    }
}

public class Daily2359 {
    public static void main(String[] args) {
        Solution2359 solution = new Solution2359();
    }
}
