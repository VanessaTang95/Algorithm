public static Character firstNonRepeatedCharacter(String str) {
    //assume all lowercase
    //put character and Integer into map
    HashMap<Character,Integer> countsMap=new HashMap<>();

    for(int i=0;i<str.length();i++){
        if(!countsMap.containsKey(str.charAt(i))){
            countsMap.put(str.charAt(i),1);
        }else{
            int count=countsMap.get(str.charAt(i));
            countsMap.put(str.charAt(i),count+1);
        }
    }

    for(int i=0; i<str.length();i++){
        if(countsMap.get(str.charAt(i))==1){
            return str.charAt(i);
        }
    }

    return null;



}
