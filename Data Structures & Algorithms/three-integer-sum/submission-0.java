class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        
        for(int left = 0;left<nums.length-1;left++){
            if (left > 0 && nums[left] == nums[left - 1]) continue;
            int middle = left+1;
            int right = nums.length-1;
            while(middle<right){
                int sum = nums[left] + nums[middle] + nums[right];
                if(sum<0){
                    middle++;
                }
                if(sum>0){
                    right--;
                }
               if (sum == 0) {
    List<Integer> triplet = new ArrayList<>();
    triplet.add(nums[left]);
    triplet.add(nums[middle]);
    triplet.add(nums[right]);
    result.add(triplet);

    while (middle < right && nums[middle] == nums[middle + 1]) middle++;
    while (middle < right && nums[right] == nums[right - 1]) right--;

    middle++;
    right--;
}
               

            }
            // prev = left;
        }
        return result;
    }
}
