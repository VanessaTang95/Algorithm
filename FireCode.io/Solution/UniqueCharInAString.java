public static boolean areAllCharactersUnique(String str){
    if(str==null || str==""){
        return true;
    }

    String str1=str.toLowerCase();

    HashMap <Character,Integer> countMap=new HashMap<>();

    for(int i=0;i<str1.length();i++){
        if(!countMap.containsKey(str1.charAt(i))){
            countMap.put(str1.charAt(i),1);
        }else{
            int counts=countMap.get(str1.charAt(i));
            countMap.put(str1.charAt(i),counts+1);
        }
    }

    for(int i=0;i<str1.length();i++){
        if(countMap.get(str1.charAt(i))==1){
            return true;
        }else{
            return false;
        }
    }

    return false;

}
