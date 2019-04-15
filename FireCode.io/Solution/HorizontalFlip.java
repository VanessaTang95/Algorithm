public static void flipHorizontalAxis(int[][] matrix) {

    if(matrix==null || matrix.length<=1){
        return;
    }

    //use pointers
    //flip didn't change column calue, it's only change the position of row
    int row_start=0;
    int row_end=matrix.length-1;

    while(row_start<row_end ){
        int temp[]=matrix[row_start];
        matrix[row_start]=matrix[row_end];
        matrix[row_end]=temp;
        row_start++;
        row_end--;
    }
}
