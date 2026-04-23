class Solution {
    public int characterReplacement(String s, int k) {
        int maxLen = 0;
        for(int i = 0;i<s.length();i++){
            Map<Character,Integer> map = new HashMap<>();
            int maxFreq = 0;
            for(int j = i;j<s.length();j++){
                char ch = s.charAt(j);
                if(map.containsKey(ch)) map.put(ch,map.get(ch)+1);
                else map.put(ch,1);
                maxFreq = Math.max(maxFreq,map.get(ch));
                int subStringLength = j-i+1;
                int res = subStringLength - maxFreq;
                if(res<=k){
                    maxLen = Math.max(maxLen,subStringLength);
                }


            }
        }
        return maxLen;
    }
}
