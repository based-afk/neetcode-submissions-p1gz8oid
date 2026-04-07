class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet <Integer> set = new HashSet();
        for(int value : nums){
            set.add(value);
        }
        if (set.size() == nums.length) return false;
        else return true;
    }
}