class Solution {
    public boolean isAnagram(String s, String t) {
        //let's break it down
        //anagram should have same length
        //anagram should have same occurance of each character
        //anagram if all characters from (A-Z), no case sensitive, should be same after sorted

        //1st solution
        if(s.length()!=t.length()){
            return false;
        }
        char[] sStr=s.toCharArray();
        char[] tStr=t.toCharArray();

        Arrays.sort(sStr);
        Arrays.sort(tStr);
        return Arrays.equals(sStr,tStr);
    }
}
