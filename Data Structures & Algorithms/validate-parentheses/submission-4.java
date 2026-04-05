class Solution {
    // public boolean isValid(String s) {
    //     if(s==null || s.length()%2!=0) return false;

    //     Stack<Character> stack = new Stack();
    //     stack.push(s.charAt(0));
    //     for(int i=1;i<s.length();i++){
    //         if(!stack.isEmpty() && ((stack.peek()=='(' && s.charAt(i)==')')
    //         || (stack.peek()=='{'&& s.charAt(i)=='}')
    //         || (stack.peek()=='['&& s.charAt(i)==']'))){
    //                 stack.pop();
    //         }else{
    //             if(stack.isEmpty() && (s.charAt(i)==')'||s.charAt(i)=='}'||
    //             s.charAt(i)==']')){
    //                 return false;
    //             }else{
    //                 stack.push(s.charAt(i));
    //             }
    //         }
    //     }

       

    //     return stack.isEmpty();
    // }

    public boolean isValid(String s) {
    if (s == null || s.length() % 2 != 0) return false;

    Stack<Character> stack = new Stack<>();

    for (char c : s.toCharArray()) {
        if (c == '(') stack.push(')');
        else if (c == '{') stack.push('}');
        else if (c == '[') stack.push(']');
        else {
            if (stack.isEmpty() || stack.pop() != c) return false;
        }
    }

    return stack.isEmpty();
}
}
