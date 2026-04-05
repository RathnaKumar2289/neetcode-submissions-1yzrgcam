class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack();
        

        for(String token:tokens){
            if(!(token.equals("+")||token.equals("-")||token.equals("*")||token.equals("/"))){
                stack.push(Integer.parseInt(token));
            }else{
                int top=stack.pop();
                int previous=stack.pop();
                int c=0;
                switch(token){
                    case "+": 
                        c=previous+top; break;
                    case "-":
                        c=previous-top; break;
                    case "*":
                        c= previous*top;break;
                    case "/":
                        c=previous/top;break;
                    default: break;                

                }
                stack.push(c);
            }
        }

        return stack.peek();
    }
}
