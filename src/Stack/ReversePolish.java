import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
        if(tokens.length==0){
            return -1;
        }
        Stack<Integer> s = new Stack<>();
        for(String token : tokens){
            if(token.equals("+")){
                s.push(s.pop()+s.pop());
            }else if(token.equals("-")){
                int b = s.pop();
                int a = s.pop();
                s.push(a-b);
            }else if(token.equals("*")){ 
                s.push(s.pop()*s.pop());
            }else if(token.equals("/")){
                int b = s.pop();
                int a = s.pop();
                s.push(a/b);
            }else{
                s.push(Integer.valueOf(token));
            }
        }
        return s.pop();
    }
}