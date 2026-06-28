class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int left = 0, right = n - 1;
        int totalWater = 0;
        while(left < right) {
            int minHeight = Math.min(heights[left], heights[right]);
            int currWater = minHeight * (right - left);
            totalWater = Math.max(currWater, totalWater);
            if(heights[left] <= heights[right]) left++;
            else right--;
        }
        return totalWater;

    }
}
