public static void flipItVerticalAxis(int[][] matrix) {
    int rows=matrix.length;
    int cols=matrix[0].length;
    int row=0;

    while(row<rows){
        int col1=0,col2=cols-1;
        while(col1<col2){
            int temp=matrix[row][col1];
            matrix[row][col1]=matrix[row][col2];
            matrix[row][col2]=temp;
            col1++;
            col2--;
        }
        row++;
    }
}
