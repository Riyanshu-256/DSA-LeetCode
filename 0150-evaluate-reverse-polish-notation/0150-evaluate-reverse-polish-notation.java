class Solution {
    public int evalRPN(String[] tokens) {
        // code here

        Stack<Integer> stack = new Stack<>();

        for(String token : tokens){

            if(!token.equals("+") && !token.equals("-") && !token.equals("*") && !token.equals("/")){
                stack.push(Integer.parseInt(token));

            } else {
                 
                int b = stack.pop();
                int a = stack.pop();

                if(token.equals("+")){
                    stack.push(a+b);
                } else if(token.equals("-")){
                    stack.push(a-b);
                } else if(token.equals("*")){
                    stack.push(a*b);
                } else{
                    stack.push(a/b);
                }
            } 
        }
        return stack.pop();
    }
}