class Solution {
    public boolean isValid(String s) {
        if(s.length() == 0){
            return true;
        }
        Stack<Character> st = new Stack<>();
        return valid(s, st);
    }

    public static boolean valid(String s, Stack<Character> st) {
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar == '(' || currentChar == '[' || currentChar == '{') {
                st.push(currentChar);
            } else {
                if (st.isEmpty()) {
                    return false;
                }
                char topChar = st.pop();
                if ((currentChar == ')' && topChar != '(') ||
                    (currentChar == ']' && topChar != '[') ||
                    (currentChar == '}' && topChar != '{')) {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}