class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        stack.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(!stack.isEmpty() && ((stack.peek()=='(' && s.charAt(i)==')')
            || (stack.peek()=='{'&& s.charAt(i)=='}')
            || (stack.peek()=='['&& s.charAt(i)==']'))){
                    stack.pop();
            }else{
                if(stack.isEmpty() && (s.charAt(i)==')'||s.charAt(i)=='}'||
                s.charAt(i)==']')){
                    return false;
                }else{
                    stack.push(s.charAt(i));
                }
            }
        }

        if(stack.isEmpty()){
            return true;
        }

        return false;
    }
}
