//Given a string, write a func that returns a string
//that contains the same characters in the reverse order

public class StringReverse{
  public static String stringReverse(String s){
    //brutal solution:
    //idea: use for loop and StringBuilder to create new String
    StringBuider sb=new StringBuilder();
    int length=s.length;
    for(int i=length-1;i>=0;i--){
      sb.append(s.charAt(i));
    }
    return sb.toString();
  }
}

//The only slight trick is to use a string StringBuilder
//T(n)=O(n);
//S(n)=O(n);
