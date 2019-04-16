class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list=new ArrayList<>();
        TreeSet ts=new TreeSet();

        for(int i=0;i<nums.length;i++){
            if(!ts.add(nums[i])){
                list.add(nums[i]);
            }
        }

        return list;

    }
}
