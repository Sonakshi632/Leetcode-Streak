class Solution {
    public int firstStableIndex(int[] nums, int k) {

        int n = nums.length;

        int[] prefixMax = new int[n];
        int[] suffixMin = new int[n];

        // Prefix Maximum
        for(int i = 0; i < n; i++){

            if(i == 0){
                prefixMax[i] = nums[i];
            }
            else{
                prefixMax[i] = Math.max(prefixMax[i - 1], nums[i]);
            }
        }

        // Suffix Minimum
        for(int i = n - 1; i >= 0; i--){

            if(i == n - 1){
                suffixMin[i] = nums[i];
            }
            else{
                suffixMin[i] = Math.min(nums[i], suffixMin[i + 1]);
            }
        }

        // Find smallest stable index
        for(int i = 0; i < n; i++){

            if(prefixMax[i] - suffixMin[i] <= k){
                return i;
            }
        }

        return -1;
    }
}