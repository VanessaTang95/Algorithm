class Solution {
    public int firstUniqChar(String s) {
        //hashmap
        char [] arr=s.toCharArray();
        HashMap<Character,Integer> countsMap = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(!countsMap.containsKey(arr[i])){
                countsMap.put(arr[i],1);
            }else{
                int count=countsMap.get(arr[i]);
                countsMap.put(arr[i],count+1);
            }
        }

        for(int i=0;i<arr.length;i++){
            if(countsMap.get(arr[i])==1){
                return i;
            }
        }

        return -1;

    }
}
