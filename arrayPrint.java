import java.util.*;

public class Printer {
    public int[] arrayPrint(int[][] arr, int n) {
        // write code here
        int[] result = new int[arr.length *(arr[0].length)];
        int x = 0;
        int y = arr[0].length-1;
        int i=0;
        int tmpx = 0;
        int tmpy = 0;
        while(y>=0){
          tmpx = x;
          tmpy = y;
        while(y<=arr[0].length-1){
          result[i]=arr[x][y];
          i++;
          x++;
          y++;
        }
        y = tmpy-1;
        x = tmpx;
      }
      x = tmpx+1;
      y = tmpy;
      while(x<=arr.length-1){
        tmpx = x;
        tmpy = y;
        while(x<=arr.length-1){
          result[i]=arr[x][y];
          i++;
          x++;
          y++;
        }
        x = tmpx+1;
        y = tmpy;
      }
     return result;
    }
}