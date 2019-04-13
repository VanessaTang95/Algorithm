public static Character firstNonRepeatedCharacter(String str) {
    //assume all lowercase
    if(str==null){
      return null;
    }

    int count[]=new int[26];

    for(int i=0;i<str.length();i++){
      count[str.charAt(i)-'a']++;
    }

    for(int i=0;i<str.length();i++){
      if(count[str.charAt(i)-'a']==1){
        return str.charAt(i);
      }
    }

    return null;



}
