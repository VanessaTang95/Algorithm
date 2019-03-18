class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {


        //HashMap HashSet
        HashMap<Integer, Integer> map=new HashMap<Integer,Integer>();
        ArrayList<Integer> result=new ArrayList<Integer>();

        for(int i=0;i<nums1.length;i++){
            map.put(nums1[i],i);
        }

        for(int e:nums2){
            if(map.containsKey(e) && !result.contains(e)){
                result.add(e);
            }
        }

        int [] ans=new int[result.size()];
        for(int i=0;i<result.size();i++){
            ans[i]=result.get(i);
        }


        return ans;

    }
}
