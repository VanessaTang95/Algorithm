class Solution {
    public int removeElement(int[] nums, int val) {
        int cropIndex=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[cropIndex++]=nums[i];
            }
        }

     return cropIndex;
}
}
