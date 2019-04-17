// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static int findMissingNumber(int[] arr) {
    //will this array have duplicate value?
    //what if nothing is missing? what to return?
    //is the array sorted
    int counts[]=new int[11];
    for(int i=0;i<arr.length;i++){
        counts[arr[i]-0]++;
    }

    for(int i=1;i<counts.length;i++){
        if(counts[i]==0){
            return i;
        }
    }

    return -1;


}
