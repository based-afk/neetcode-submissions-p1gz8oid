class Solution {
    public boolean isValid(String s) {
        if(s.length()==1) return false;
        Stack<Character> stk = new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='{' || ch=='[' || ch=='('){
                stk.push(ch);
            }else{
                if(stk.isEmpty()){
                    return false;
                }
                char top = stk.pop();
                if(top=='(' && ch!=')') return false;
                if(top=='[' && ch!=']') return false;
                if(top=='{' && ch!='}') return false;
            }
        }
        return stk.isEmpty();
    }
}
