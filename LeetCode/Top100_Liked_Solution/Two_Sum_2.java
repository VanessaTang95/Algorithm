//Two Sum one-pass hashmap Solution
//time complexity should be O(n);

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int targetNum=target-nums[i];
            if(map.containsKey(targetNum)){
                return new int[]{map.get(targetNum),i};
            }
            map.put(nums[i],i);
        }

        return new int[2];
    }
}
