//36. Valid Sudoku

public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] == '.') continue;
                int n = 0;
                while(n < board.length){
                    if(board[n][j] == '.'){
                        n++;
                        continue;}
                    if(n == i){
                        n++;
                        continue;    
                    }
                    if(board[n][j] == board[i][j]) return false;
                    n++;
                }
                int k = 0;
                while(k < board[i].length){
                    if(board[i][k] == '.'){
                        k++;
                        continue;}
                    if(k == j){
                        k++;
                        continue;    
                    }
                    if(board[i][k] == board[i][j]) return false;
                    k++;    
                }
                int m = i / 3 * 3 + 2;
                int t = j / 3 * 3 + 2;
                for(int x = i / 3 * 3; x <= m; x++){
                    for(int y = j / 3 * 3; y <= t; y++){
                        if(x == i && y == j) continue;
                        if(board[x][y] == '.') continue;
                        if(board[x][y] == board[i][j]) return false;
                    }
                }
            }
        }
        return true;
    }