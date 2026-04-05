class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> row = new HashSet<>();
        Set<Character> column = new HashSet<>();
        //Check row
        for(int i=0;i<board.length;i++){
            row.clear();
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]!='.'&& !row.add(board[i][j])) return false;
            }
        }

        //Check Column
        for(int j=0;j<board[0].length;j++){
            column.clear();
            for(int i=0;i<board.length;i++){
                if(board[i][j]!='.'&& !column.add(board[i][j])) return false;
            }
        }

        //Box Check
        Set<Character> box = new HashSet<>();
        for(int block=0;block<board.length;block++){
             box.clear();
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    int r = (block/3)*3+i;
                    int c = (block%3)*3+j;
                  if(board[r][c]!='.'&& !box.add(board[r][c])) return false;
                }
            }
        }

        return true;
    }
}
