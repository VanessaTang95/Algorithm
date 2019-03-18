class Solution {
    public void reverseString(char[] s) {
        if (s.length<=1){
            return;
        }


        int start=0;
        int end=s.length-1;
        while(start<end){
            swap(s,start,end);
            start++;
            end--;
        }
    }

    public char[] swap(char[] s,int start, int end){
        char temp;
        temp=s[start];
        s[start]=s[end];
        s[end]=temp;
        return s;
    }
}
