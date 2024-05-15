package Day16;

import com.sun.source.tree.BreakTree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class FindSafestPathInGrid {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] grid = {{0, 0, 0, 1}, {0, 0, 0, 0}, {0, 0, 0, 0}, {1, 0, 0, 0}};
        System.out.println(solution.maximumSafenessFactor(grid));
    }
}

class Solution{
    int n;
    int[][] directions = {{1,0}, {-1, 0}, {0, -1}, {0, 1}};
    int maximumSafenessFactor(int[][] grid){
        n = grid.length;

//         Step - 1 Precalculation of distanceNearestThief - for each cell
        int[][] distanceNearestThief = new int[n][n];
        for (int[] row: distanceNearestThief){
            Arrays.fill(row, -1);
        }

        Queue<int[]> queue = new LinkedList<>();
         boolean[][] visited = new boolean[n][n];



//        Push all cells in queue where thieves are present
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if(grid[i][j] == 1){
                    queue.offer(new int[]{i, j});
                    visited[i][j] = true;
                }
            }
        }
        int level = 0;
        while(!queue.isEmpty()){
            int size = queue.size();

            while (size-- > 0){
                int[] curr = queue.poll();
                int curr_i = curr[0];
                int curr_j = curr[1];


                distanceNearestThief[curr_i][curr_j] = level;
                for (int[] dir : directions){
                    int new_i = curr_i + dir[0];
                    int new_j = curr_j + dir[1];

                    if (new_i < 0 || new_i >= n || new_j < 0 || new_j >= n || distanceNearestThief[new_i][new_j] != -1){
                        continue;
                    }

                    queue.offer(new int[]{new_i, new_j});
                    visited[new_i][new_j] = true;
                }
            }
            level++;
        }

//        Step - 2 Apply Binary Search of sf : safe factor
        int l = 0;
        int r = 400;
        int result = 0;

        while( l <= r){
            int mid_sf = l + (r - l)/2;

            if (check(distanceNearestThief, mid_sf)){
                result = mid_sf;
                l = mid_sf + 1;
            }else{
                r = mid_sf - 1;
            }
        }return  result;

    }

    boolean check(int[][] distanceNearestThief, int sf){
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][n];

        queue.offer(new int[]{0, 0});
        visited[0][0] = true;

        while (!queue.isEmpty()){
            int[] curr = queue.poll();
            int curr_i = curr[0];
            int curr_j = curr[1];


            if(curr_i == n - 1 || curr_j == n - 1){
                return true;
            }

            for (int[] dir: directions){
                int new_i = curr_i + dir[0];
                int new_j = curr_j + dir[1];

                if (new_i >= 0 && new_i < n && new_j >= 0 && new_j < n && visited[new_i][new_j] != true){
                    if (distanceNearestThief[new_i][new_j] < sf){
                        continue;  // reject this cell
                    }
                    queue.offer(new int[]{new_i, new_j});
                    visited[new_i][new_j] = true;
                }
            }
        }
        return false;
    }

}