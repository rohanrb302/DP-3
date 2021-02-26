class Solution {
    public int deleteAndEarn(int[] nums) {
        if(nums == null || nums.length ==0)
            return 0;
        // Build an array
        
        
        int []dp = new int[Arrays.stream(nums).max().getAsInt() +1];
        int result = Integer.MIN_VALUE;
        for( int x : nums){
            dp[x] += x;
        }
        
        dp[1] = Math.max(dp[0],dp[1]);
        for(int i=2;i < dp.length;i++) {
            dp[i] = Math.max(dp[i-1],dp[i-2]+dp[i]);
            
        }
        return dp[dp.length-1];
        
    }
}
