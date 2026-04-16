

class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> seen = new HashSet<>();

        int left = 0;
        int max = 0;

        for(int right = 0; right < s.length(); right++){

            char ch = s.charAt(right);

            // shrink window until duplicate removed
            while(seen.contains(ch)){
                seen.remove(s.charAt(left));
                left++;
            }

            seen.add(ch);

            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}