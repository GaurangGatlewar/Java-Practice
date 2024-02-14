import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        int start = 0, end = 0, maxLength = 0;
        while (end < s.length()){
            if (map.containsKey(s.charAt(end))){
                if ((end-start) > maxLength) maxLength = end-start;
                map.remove(s.charAt(start));
                start += 1;
            } else {
                map.put(s.charAt(end), 1);
                end += 1;
            }
        }
        if ((end-start) > maxLength) maxLength = end-start;
        return maxLength;
    }
}