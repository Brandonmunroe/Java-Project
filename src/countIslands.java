//public static int countIslands(int[][] grid) {
//if (grid == null || grid.length == 0) return 0;

//  int rows = grid.length;
// int cols = grid[0].length;
// int count = 0;

//  for (int i = 0; i < rows; i++) {
//     for (int j = 0; j < cols; j++) {
//         if (grid[i][j] == 1) {
//             count++;
                        //             dfs(grid, i, j);  // mark entire island as visited
//       }
                    //      }
// }
//  return count;
//}

//private static void dfs(int[][] grid, int r, int c) {
//  if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] == 0)
// return;

//  grid[r][c] = 0;  // mark as visited (sink the island)

//   dfs(grid, r + 1, c); // down
//  dfs(grid, r - 1, c); // up
//  dfs(grid, r, c + 1); // right
//  dfs(grid, r, c - 1); // left
//}
