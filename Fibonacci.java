/*
方法一：递归
*/
public class Solution {
    public int Fibonacci(int n) {
        // 初始值
        if(n <= 0)
            return 0;
        if(n == 1 || n == 2)
            return 1;
        // F(n)=F(n-1)+F(n-2)
        return Fibonacci(n - 1) + Fibonacci(n - 2);
   }
}
/*
方法二：动态规划
*/
public class Solution {
    public int Fibonacci(int n) {
        // 初始值
        if(n <= 0)
            return 0;
        // 申请一个数组，保存子问题的解，题目要求从第0项开始
        int[] array = new int[n + 1];
        array[0] = 0;
        array[1] = 1;
        for(int i = 2; i <= n; ++i)
       {
            // F(n)=F(n-1)+F(n-2)
            array[i] = array[i - 1] + array[i - 2];
       }
        return array[n];
   }
}
//或者
public class Solution {
    public int Fibonacci(int n) {
        // 初始值
        if(n <= 0)
            return 0;
        if(n == 1 || n == 2)
            return 1;
        int ret = 0;
        int fn1 = 1, fn2 = 1;
      
        for(int i = 3; i <= n; ++i)
       {
            // F(n)=F(n-1)+F(n-2)
            ret = fn1 + fn2;
            // 更新值
            fn2 = fn1;
            fn1 = ret;
       }
        return ret;
   }
}
