class Solution {
    public void moveZeroes(int[] nums) {
    ArrayList<Integer> newArray=new ArrayList<>();
    for(int i=0;i<nums.length;i++){
      if(nums[i]!=0){
        newArray.add(nums[i]);
      }
    }


    for(int i=0;i<newArray.size();i++){
      nums[i]=newArray.get(i);
    }

    for(int i=newArray.size();i<nums.length;i++){
      nums[i]=0;
    }


    }
}
