//Solution to this problem
//lc TAG: EASY
//Accepted submission

class Solution{
    public boolean isValid(String s) {
        //if it's empty it's true
        if(s.equals("")){
            return true;
        }
        //if it only have one charater, it's false
        if(s.length()==1){
            return false;
        }

        //use a stack to store the character
        Stack<Character> stack=new Stack<Character>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='{' || s.charAt(i)=='[' || s.charAt(i)=='('){
                stack.push(s.charAt(i));
            }else if(s.charAt(i)=='}' && !stack.isEmpty() && stack.peek()=='{'){
                stack.pop();
            }else if(s.charAt(i)==']' && !stack.isEmpty() && stack.peek()=='['){
                stack.pop();
            }else if(s.charAt(i)==')' && !stack.isEmpty() && stack.peek()=='('){
                stack.pop();
            }else{
            stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }
}
//The T(n)=O(n);
