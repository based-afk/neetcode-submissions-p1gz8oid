class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        prefix[0]=1;
        int[] postfix = new int[nums.length];
        postfix[0] = 1;
        for(int i = 1;i<nums.length;i++){
            prefix[i] = nums[i-1]*prefix[i-1];
        }
        postfix[nums.length-1] = 1;
        for(int j = nums.length-2;j>=0;j--){
            postfix[j] = postfix[j+1]*nums[j+1];
        }
        int[] result = new int[nums.length];
        for(int k = 0;k<nums.length;k++){
            result[k] = postfix[k]*prefix[k];
        }
        return result;
    }
}  
