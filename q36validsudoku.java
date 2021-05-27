class Solution { 

    public boolean isValidSudoku(char[][] board) { 

     

    for(int i = 0; i < 9; i++){ 

        for(int j = 0; j < 9; j++){ 

            if(board[i][j] == '.') continue; 

            int n = 0; 

            while(n < 9){ 

                if (n == j || n == i){  

                    n++; 

                    continue; 

                }     

                if (board[i][j] == board[i][n] || board[i][j] == board[n][j]) return false; 

                else n++; 

            } 

                     

            for(int a = i / 3 * 3, row = a + 3; a < row; a++){ 

                for(int b = j / 3 * 3, col = b + 3; b < col; b++){ 

                    if ( a == i && b == j) continue; 

                    if (board[i][j] == board[a][b]) return false; 

                } 

            } 

        } 

    } 

    return true; 

    } 

} 