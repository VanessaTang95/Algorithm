public static boolean isStringPalindrome(String str){
    //reverse the string to check if the string value is the same

    return str==null || str.equals(reverse(str));



}

public static String reverse(String str){
    char [] arr=str.toCharArray();
    int first=0,last=arr.length-1;
    while(first<last){
        char temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
        first++;
        last--;
    }
    return String.valueOf(arr);
