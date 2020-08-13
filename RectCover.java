public class Solution {
    public int RectCover(int target) {
        //方法一
/*        if(target == 0 ||target == 1 || target == 2){
            return target;
        }else{
            return RectCover(target - 1) + RectCover(target - 2);
        }
*/
        //方法二
        if(target <= 3) {
            return target;
        }
        int ret = 0;
        int fn1 = 3, fn2 = 2;
        for(int i = 4; i <= target; i++){
            ret = fn1 + fn2;
            fn2 = fn1;
            fn1 = ret;
        }
        return ret;
    }
}