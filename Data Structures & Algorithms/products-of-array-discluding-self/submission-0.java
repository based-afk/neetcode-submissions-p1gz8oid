class Solution {
    public int[] productExceptSelf(int[] nums) {
        int i = 0;
        int[] result = new int[nums.length];
        while(i<nums.length){
            ArrayList <Integer> ls = new ArrayList<>();
            for(int num : nums){
                ls.add(num);
            }
            ls.remove(i);
            int productExceptSelf = product(ls);
            result[i++] = productExceptSelf; 

        }
        return result;
    }
    static int product(List<Integer> ls){
        int product = 1;
        for(int num:ls){
            product*=num;
        }
        return product;
    }
}  
