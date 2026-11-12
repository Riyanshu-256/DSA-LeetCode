class Solution {
    public String processStr(String s) {
        // code here

        StringBuilder str = new StringBuilder();

        for (char ch : s.toCharArray()) {

            if (ch >= 'a' && ch <= 'z') {
                str.append(ch);
            }
            else if (ch == '*') {
                if (str.length() > 0)
                    str.deleteCharAt(str.length() - 1);
            }
            else if (ch == '#') {
                str.append(str);
            }
            else if (ch == '%') {
                str.reverse();
            }
        }

        return str.toString();
    }
}