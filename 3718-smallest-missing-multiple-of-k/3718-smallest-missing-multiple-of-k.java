class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int minimum_multiple = k;
        while(set.contains(minimum_multiple)){
            minimum_multiple = minimum_multiple + k;
        }
        return minimum_multiple;
    }
}