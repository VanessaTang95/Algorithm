public static int singleNumber(int[] A) {
    int size=A.length;
    //use HashMap

    HashMap<Integer,Integer> countMap=new HashMap<>();

    for(int i=0;i<size;i++){
        if(!countMap.containsKey(A[i])){
            countMap.put(A[i],1);
        }else{
            int cur_Count=countMap.get(A[i]);
            countMap.put(A[i],cur_Count+1);
        }
    }

    for(int i=0;i<size;i++){
        if(countMap.get(A[i])==1){
            return A[i];
        }
    }


    return Integer.MAX_VALUE;
