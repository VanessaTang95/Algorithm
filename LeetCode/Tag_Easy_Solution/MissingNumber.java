//Simple Math_Sum_Solution
class Solution {
    public int missingNumber(int[] nums) {
        int curSum=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            curSum+=nums[i];
        }

        for(int i=0;i<=nums.length;i++){
            sum+=i;
        }

        return sum-curSum;

    }
}
