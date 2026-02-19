package Assignment;

public class WordSearch {

    public static boolean wordSearch(char[][] grid, String word) {
        int rows = grid.length;
        int cols = grid[0].length;


        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (dfs(grid, word, r, c, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean dfs(char[][] grid, String word, int r, int c, int index) {


        if (index == word.length()) {
            return true;
        }


        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length ||
                grid[r][c] != word.charAt(index)) {
            return false;
        }


        char temp = grid[r][c];
        grid[r][c] = '#';


        boolean found =
                dfs(grid, word, r + 1, c, index + 1) ||   // down
                        dfs(grid, word, r - 1, c, index + 1) ||   // up
                        dfs(grid, word, r, c + 1, index + 1) ||   // right
                        dfs(grid, word, r, c - 1, index + 1);      // left


        grid[r][c] = temp;

        return found;
    }

    public static void main(String[] args) {

        char[][] grid1 = {
                {'C','A','T'},
                {'D','O','G'},
                {'R','A','T'}
        };
        System.out.println(wordSearch(grid1, "CAT"));   // true

        char[][] grid2 = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };
        System.out.println(wordSearch(grid2, "SEE"));   // true

        char[][] grid3 = {
                {'C','A','T'},
                {'D','O','G'},
                {'R','A','T'}
        };
        System.out.println(wordSearch(grid3, "CART"));  // false
    }
}
