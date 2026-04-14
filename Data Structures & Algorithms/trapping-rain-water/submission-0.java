class Solution {
    public int trap(int[] height) {
        int l = 0 , r = height.length-1;
        int leftMax = height[l] , rightMax = height[r];
        int sum = 0;

        while(l<r){
            if(leftMax<=rightMax){
                l++;
                leftMax = Math.max(height[l],leftMax);
                sum+=leftMax-height[l];
            }
            if(leftMax>rightMax){
                r--;
                rightMax = Math.max(height[r],rightMax);
                sum+=rightMax-height[r];
            }
        }
        return sum;
        
    }
}
