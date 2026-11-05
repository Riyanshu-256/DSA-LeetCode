class Solution {
    public boolean isValid(String s) {
        // code here

        Stack<Character> st = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            // Opening Brackets
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            } else{

                // Closing bracket
                if(st.isEmpty()){
                    return false;
                }
                char top = st.pop();
                if((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')){
                    return false;
                } 
            }
        }
        return st.isEmpty();
    }
}