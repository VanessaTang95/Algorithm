class Solution {
    public boolean isAnagram(String s, String t) {
        //2nd solution
        //use array to count the occurance of character

        if(s.length()!=t.length()){
            return false;
        }

        int []count=new int[26];

        for(int index=0;index<s.length();index++){
            count[s.charAt(index)-'a']++;//count store the times of occurance of alphbet,index 0 of count stands for a
            count[t.charAt(index)-'a']--;//if they are anagrams, the count will be an all 0 array
        }

        for(int e: count){
            if(e!=0){
                return false;
            }
        }

        return true;

    }
}
