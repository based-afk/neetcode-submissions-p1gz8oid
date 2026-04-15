class Solution {
    public int trap(int[] height) {
        int l = 0 , r = height.length-1;
        int leftMax = height[l], rightMax = height[r];
        int total = 0;
        // int current= 0;
        while(l<r){
            // int trappedWater = Math.min(leftMax,rightMax) - height[current];
            // total+=trappedWater;
            if(leftMax<=rightMax){
                l++;
                leftMax=Math.max(leftMax,height[l]);
                total+=leftMax - height[l];
            }else{
                r--;
                rightMax=Math.max(rightMax,height[r]);
                total+= rightMax - height[r];
            }
        }
        return total;
    }
}
