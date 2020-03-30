class Solution {
    public int[] sortedSquares(int[] A) {
          int n = A.length;
        int[] ans = new int[N];
        for (int i = 0; i <n; ++i){
            ans[i] = A[i] * A[i];
        }
        Arrays.sort(ans);
        return ans;
    }
}