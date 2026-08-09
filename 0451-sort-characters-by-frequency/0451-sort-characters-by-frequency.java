class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char a : s.toCharArray()){
            map.put(a, map.getOrDefault(a, 0) + 1);

        }
        PriorityQueue<Character> pq = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a)
        );
        for(char a : map.keySet()){
            pq.add(a);
        }
         StringBuilder result = new StringBuilder();
        while(!pq.isEmpty()){
            char a = pq.poll();
            for(int i = 0; i < map.get(a); i++){
                result.append(a);
            }
        }
        return result.toString();
    }
}