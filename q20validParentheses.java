//20. Valid Parentheses

public boolean isValid(String s) {
        if(s == null || s.length() <= 1) return false;
        boolean ans = true;
        Stack<Character> s1 = new Stack<Character>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            switch (ch){
                case '(':
                    s1.push(')');
                    continue;
                case '[':
                    s1.push(']');
                    continue;
                case '{':
                    s1.push('}');
                    continue;
                default:
                    if(s1.empty() == true || s1.pop() != ch)
                        return false;
                    continue;
            }
        }
        if(s1.empty() == false) ans = false;
        return ans;
    }