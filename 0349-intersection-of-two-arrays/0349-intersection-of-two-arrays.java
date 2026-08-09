class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num1 : nums1){
            map.put(num1 , map.getOrDefault(num1,0)+1);
            
        }
        ArrayList<Integer> result = new ArrayList<>();
        for(int num2 : nums2){
            if(map.containsKey(num2)){
                result.add(num2);
                map.remove(num2);
            }
        }
                int[] answer = new int[result.size()];

        for(int i = 0; i < result.size(); i++){
            answer[i] = result.get(i);
        }

        return answer;
    }
}