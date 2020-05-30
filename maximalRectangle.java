class Solution {
   public int maximalRectangle(char[][] matrix) {
     if (matrix.length == 0) {
        return 0;
     }
     int maxArea = 0;
     int cols = matrix[0].length;
     int[] leftLessMin = new int[cols];
     int[] rightLessMin = new int[cols];
     Arrays.fill(leftLessMin, -1); 
     Arrays.fill(rightLessMin, cols); 
     int[] heights = new int[cols];
     for (int row = 0; row < matrix.length; row++) {
         for (int col = 0; col < cols; col++) {
             if (matrix[row][col] == '1') {
                heights[col] += 1;
               } else {
                heights[col] = 0;
            }
        }
        int boundary = -1;
        for (int col = 0; col < cols; col++) {
            if (matrix[row][col] == '1') {
                leftLessMin[col] = Math.max(leftLessMin[col], boundary);
            } else {
                leftLessMin[col] = -1; 
                boundary = col;
            }
        }
        boundary = cols;
        for (int col = cols - 1; col >= 0; col--) {
            if (matrix[row][col] == '1') {
                rightLessMin[col] = Math.min(rightLessMin[col], boundary);
            } else {
                rightLessMin[col] = cols;
                boundary = col;
            }
        }
        for (int col = cols - 1; col >= 0; col--) {
            int area = (rightLessMin[col] - leftLessMin[col] - 1) * heights[col];
            maxArea = Math.max(area, maxArea);
        }

    }
    return maxArea;
   }
}