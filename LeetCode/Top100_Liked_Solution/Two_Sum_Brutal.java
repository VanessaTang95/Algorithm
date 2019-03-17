class Solution {
    public int[] twoSum(int[] nums, int target) {
        //brutal solution
        //using two loops to solve
        int result[]=new int[2];
        int length=nums.length;
        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                if(nums[i]+nums[j]==target){
                    result[0]=i;
                    result[1]=j;
                }
            }
        }
        return result;
    }
}
//Time complexity is O(n^2)
