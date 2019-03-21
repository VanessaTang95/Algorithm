/*description:
    Given two Strings, write a func to check if one string
    is a rotation of the other one
*/
public class Solution{
  //brutal solution: use two pointer
  public boolean isRotation(String s1, String s2){
      //same length?

      return (s1.length()==s2.length() &&
              ((s1+s1).indexOf(s2)!=-1);
      }
    }
  //T(n)=O(n^2)
  //S(n)=O(n)
