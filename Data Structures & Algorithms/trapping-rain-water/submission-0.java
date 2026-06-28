class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int leftMax = 0, rightMax = 0;
        int left = 0, right = n - 1;
        int trappedWater = 0;

        while(left < right) {
            if(height[left] <= height[right]) {
                if(leftMax < height[left]) leftMax = height[left];
                else trappedWater += leftMax - height[left];
                left++;
            } else {
                if(rightMax < height[right]) rightMax = height[right];
                else trappedWater += rightMax - height[right];
                right--;
            }
        }
        return trappedWater;
    }
}
