//Another Accepted and brilliant Solution
class Solution2 {
    public boolean isValid(String s) {
        if(s.equals("")){
            return true;
        }

        if(s.length()==1){
            return false;
        }

        Stack<Character> stack=new Stack<Character>();

        for(char c: s.toCharArray()){
            if(c=='('){
                stack.push(')');
            }else if(c=='{'){
                stack.push('}');
            }else if(c=='['){
                stack.push(']');
            }else if(stack.isEmpty() || stack.pop()!=c){
                return false;
            }
        }
        return stack.isEmpty();
      }
    }
