class Solution {
    public String longestPalindrome(String s) {
        int maxLength = 0;
        String palindrome = "";
        for(int i=0;i<s.length();i++){
            int start = i, end = i;
            while(start>=0 && end<s.length()){
                if (s.charAt(start) == s.charAt(end)){
                    start -= 1;
                    end += 1;
                } else {
                    break;
                }
            }
            if (end-start>maxLength){
                palindrome = s.substring(start+1,end);
                maxLength = end-start;
            }

            start = i;
            end = i+1;
            while(start>=0 && end<s.length()){
                if (s.charAt(start) == s.charAt(end)){
                    start -= 1;
                    end += 1;
                } else {
                    break;
                }
            }
            if (end-start>maxLength){
                palindrome = s.substring(start+1,end);
                maxLength = end-start;
            }
        }
        return palindrome;
    }
}