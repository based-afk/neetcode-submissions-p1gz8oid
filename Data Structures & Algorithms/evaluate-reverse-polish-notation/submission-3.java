class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stk = new ArrayDeque<>();
        int result = 0;
        for(String str : tokens){
            if(str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")){
                int b = stk.pollFirst();
                int a = stk.pollFirst();
                switch(str) {
                    case "+" :
                        result = a + b;
                        stk.addFirst(result);
                        break;
                    case "-" :
                        result = a - b;
                        stk.addFirst(result);
                        break;
                    case "*" :
                        result = a * b;
                        stk.addFirst(result);
                        break;
                    case "/" :
                        result = a / b;
                        stk.addFirst(result);
                        break;
                }
            }else{
                stk.addFirst(Integer.parseInt(str));
            }
        }
        return stk.peek();
    }
}
