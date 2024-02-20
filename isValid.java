class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            switch(s.charAt(i)){
                case '(': st.push(')');
                break;
                case '{': st.push('}');
                break;
                case '[': st.push(']');
                break;
                default: if(st.size()==0) return false;
                Character c = st.pop();
                if (c != s.charAt(i)){
                    return false;
                }
            }
        }
        if(st.size()>0) return false;
        return true;
    }
}