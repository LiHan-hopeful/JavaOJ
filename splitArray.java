class Solution {

    public int splitArray(int[] nums) {
        int[] minPrime = new int[1000000 + 1];
        for (int i = 2; i < minPrime.length; i++) {
            if (minPrime[i] < 2) {
                for (int j = i; j < minPrime.length; j += i) {
                    minPrime[j] = i;
                }
            }
        }
        int[] dp = new int[nums.length];
        Map<Integer,Integer> posMap=new HashMap<Integer,Integer>();

        for (int i = 0; i < nums.length; i++) {
            dp[i] = i > 0 ? dp[i - 1] + 1 : 1;
            int n = nums[i];
            while (n > 1) {
                int factor = minPrime[n];
                int minIndex = i;
                if (posMap.containsKey(factor)) {
                    minIndex = posMap.get(factor);
                }else {
                     posMap.put(factor, minIndex);
                }
                if (minIndex == 0) {
                    dp[i] = 1;
                } else {
                    if ( ( dp[minIndex - 1] + 1 ) < dp[i] ){
                        dp[i] = dp[minIndex - 1] + 1;
                    }
                }
                if (dp[i] < dp[minIndex]) {
                    posMap.put(factor, i);
                }
                n = n / factor;
            }
        }
        return dp[nums.length - 1];
    }
}


