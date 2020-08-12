class Solution {
       //四个方向的位置更新：顺时针更新
       int[][] nextPosition = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
       public void dfs(char[][] board, int row, int col, int i, int j) {
             //当前位置设为'*'
             board[i][j] = '*';
             for (int k = 0; k < 4; ++k)  {
                   //向四个方向扩散
                   int ni = i + nextPosition[k][0];
                   int nj = j + nextPosition[k][1];
                      //判断边界
                  if (ni < 0 || ni >= row
                  || nj < 0 || nj >= col) {
                       continue;
                  }
                  //是'O'说明和边联通，继续搜索是否还有联通的
                 if (board[ni][nj] != '*' && board[ni][nj] != 'X') {
                       dfs(board, row, col, ni, nj);
                }
            }
      }
      public void solve(char[][] board) {
             if (board.length == 0) {
                     return;
             }
            //寻找边上的每一个0，如果没有，
            //表示所有的0都被包围
            int row = board.length;
            int col = board[0].length;
            //寻找第一行和最后一行
           for (int j = 0; j < col; ++j) {
                  if (board[0][j] == 'O') {
                        dfs(board, row, col, 0, j);
                 }
                 if (board[row - 1][j] == 'O') {
                        dfs(board, row, col, row - 1, j);
                 }
           }
           //寻找第一列和最后一列
          for (int i = 0; i < row; ++i) {
                 if (board[i][0] == 'O') {
                       dfs(board, row, col, i, 0);
                }
                if (board[i][col - 1] == 'O')
                       dfs(board, row, col, i, col - 1);
                }
         }
         for (int i = 0; i < row; ++i) {
               for (int j = 0; j < col; ++j) {
                       if (board[i][j] == '*') {
                              board[i][j] = 'O';
                       }  else if (board[i][j] == 'O') {
                              board[i][j] = 'X';
                          }
               }
         }
     }
} 	
