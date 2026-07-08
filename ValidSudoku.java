class Solution {
    public boolean isValidSudoku(char[][] board) {

         //checking rows
         for(int i=0;i<board.length;i++){
            Set<Character> set = new HashSet<>();
            for(int j=0;j<board.length;j++){
                if (board[i][j]== '.') continue;
                if (set.contains(board[i][j])) return false;
                set.add(board[i][j]);
            }
         }

         //checking columns
         for(int i=0;i<board.length;i++){
            Set<Character> set = new HashSet<>();
            for(int j=0;j<board.length;j++){
                if (board[j][i]== '.') continue;
                if (set.contains(board[j][i])) return false;
                set.add(board[j][i]);
            }
         }

         //checking scares
        for (int box = 0; box < 9; box++) {
            Set<Character> set = new HashSet<>();
            int startRow = (box / 3) * 3;
            int startCol = (box % 3) * 3;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    char c = board[startRow + i][startCol + j];
                    if (c == '.') continue;
                    if (set.contains(c)) return false;
                    set.add(c);
                }
            }
        }

        return true;

    }
}
