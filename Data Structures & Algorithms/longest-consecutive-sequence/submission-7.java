class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        int maxLength = 0;
        for(int num : nums){
            seen.add(num);
            // int length = 0;
        }
        for(int num : nums){
            int length = 1;
            if(!seen.contains(num - 1)){
                while(seen.contains(num+1)){
                    length++;
                    num+=1;
                }
            }
            maxLength = Math.max(maxLength,length);
        }
        return maxLength;

    }
}