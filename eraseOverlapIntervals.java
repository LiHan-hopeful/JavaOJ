public class Solution {
    class myComparator implements Comparator<int[]> {
        //按起点递增排序
        public int compare(int[] a, int[] b) {
            return a[0] - b[0];
        }
    }
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) {
            return 0;
        }
        //起点排序
        Arrays.sort(intervals, new myComparator());

        int end = intervals[0][0], prev = 0, count = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[prev][1] > intervals[i][0]) {
                if (intervals[prev][1] > intervals[i][1]) {
                    //情况2
                    prev = i;
                }
                //情况3
                count++;
            } else {
                //情况1
                prev = i;
            }
        }
        return count;
    }
}