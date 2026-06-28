class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> indexMap = new HashMap<>();
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if(indexMap.containsKey(complement)) return new int[]{indexMap.get(complement), i};
            indexMap.put(nums[i],i);
        }
        return new int[0];
    }
}
