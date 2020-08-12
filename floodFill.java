class Solution {
   //四个方向的位置更新：顺时针更新
    int[][] nextPosition = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
    public void dfs(int[][] image, int row, int col, int[][] book,
                    int sr, int sc, int oldColor, int newColor)
   {
        //处理当前逻辑，修改颜色，并且标记已经修改过了
        image[sr][sc] = newColor;
        book[sr][sc] = 1;
        //遍历每一种可能，四个方向
        for (int k = 0; k < 4; ++k)
       {
            int newSr = sr + nextPosition[k][0];
            int newSc = sc + nextPosition[k][1];
            //判断新位置是否越界
            if (newSr >= row || newSr < 0
                    || newSc >= col || newSc < 0)
                continue;
            //如果颜色符合要求，并且之前也没有渲染过，则继续渲染
            if (image[newSr][newSc] == oldColor && book[newSr][newSc] == 0)
           {
                dfs(image, row, col, book, newSr, newSc, oldColor, newColor);
           }
       }
   }
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int oldColor = image[sr][sc];
        int row = image.length;
        int col = image[0].length;
        //建立标记
        int[][] book = new int[row][col];
        dfs(image, row, col, book, sr, sc, oldColor, newColor);
        return image;
   }
}
