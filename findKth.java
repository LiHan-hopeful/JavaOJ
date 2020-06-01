import java.util.*;

public class Finder {
  public int findKth(int[] a, int n, int K) {
    
    myQuickSort(0,n-1,a);
    return a[n-K];
    }
    public static void myQuickSort(int left, int right, int[] arr)
    {
      if(left>right)
        return;
      int leftIndex = left;
      int rightIndex = right;
      int key = arr[left];
      int num;
      while(rightIndex>leftIndex)
      {
        while(arr[rightIndex]>=key&&rightIndex>leftIndex)
        {
          rightIndex--;
        }
        while(arr[leftIndex]<=key&&rightIndex>leftIndex)
        {
          leftIndex++;
        }
        if(rightIndex>leftIndex)
        {
           num = arr[leftIndex];
           arr[leftIndex]=arr[rightIndex];
           arr[rightIndex]=num;          
        }
      }
      num = arr[left];
      arr[left]=arr[rightIndex];
      arr[rightIndex]=num;
      myQuickSort(left,leftIndex-1,arr);
      myQuickSort(leftIndex+1,right,arr);
    }
  
}