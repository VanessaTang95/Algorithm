class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }

        int corpIndex=0;

        for(int i=1;i<nums.length;i++){

            if(nums[i]!=nums[corpIndex]){
                nums[++corpIndex]=nums[i];
            }
        }

        return corpIndex+1;

    }
}
