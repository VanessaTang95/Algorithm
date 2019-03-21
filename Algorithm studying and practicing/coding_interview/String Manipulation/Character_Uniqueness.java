//description:
//Given a string, check is all character in that array is unique

Class Solution{
  public boolean isUnique(String s){
      //null string should return false
      if(s.isEmpty()){
        return false;
      }

      HashSet<Character> hs=new HashSet<>();

      for(int i=0;i<s.length();i++){
        if(hs.contains(s.charAt(i))){
          return false;
        }
        hs.add(s.charAt(i));
      }
      return true;
  }

}
