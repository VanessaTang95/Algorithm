public static String reverseString(String str){

    if(str==null){
        return null;
    }

    char [] arr=str.toCharArray();

    int left=0;
    int right=arr.length-1;

    while(left<right){
        swap(left,right,arr);
        left++;
        right--;
    }


    return String.valueOf(arr);
}

public static char[] swap(int left, int right, char[] arr){
    char temp=arr[left];
    arr[left]=arr[right];
    arr[right]=temp;
    return arr;
}
