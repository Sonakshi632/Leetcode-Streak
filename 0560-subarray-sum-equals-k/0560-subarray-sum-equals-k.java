class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int prefixSum = 0;
        int count = 0 ; // to check  how many subarrays
        map.put(0,1);   // if onlyone element is to be checked
        for(int i= 0 ; i < nums.length ; i++){
            prefixSum += nums[i];
            int needed = prefixSum - k; // subarray cal
            if(map.containsKey(needed)){
                count += map.get(needed);
            }
            map.put(prefixSum , map.getOrDefault(prefixSum , 0) +1);
        }
        return count;
    }
}