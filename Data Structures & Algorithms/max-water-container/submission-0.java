class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length - 1;
        int maxArea = Integer.MIN_VALUE;
        while(l<r){
            int height = Math.min(heights[l],heights[r]);
            int width = r-l;
            int area = height*width;
            if(heights[l]<heights[r]){
                l++;
            }else if(heights[l]>heights[r]){
                r--;
            }else if(heights[l]==heights[r]){
                l++;
                r--;
            }
            maxArea = Math.max(area,maxArea);
        }
        return maxArea;
    }
}
