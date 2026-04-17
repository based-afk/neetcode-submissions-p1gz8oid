// import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> seen = new HashSet<>();

        int left = 0;
        int seq = 0;
        int max = 0;

        for(int right = 0; right < s.length(); right++){

            char ch = s.charAt(right);

            while(seen.contains(ch)){
                seen.remove(s.charAt(left));
                left++;
                seq--;
            }

            seen.add(ch);
            seq++;

            max = Math.max(max, seq);
        }

        return max;
    }
}