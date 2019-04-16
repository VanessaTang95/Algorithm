// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static String duplicate(int[] numbers){
    Arrays.sort(numbers);

    TreeSet ts=new TreeSet();
    ArrayList al=new ArrayList();
    for(int i=0;i<numbers.length;i++){
        if(!ts.add(numbers[i])){
            al.add(numbers[i]);
        }
    }
    return al.toString();

}
