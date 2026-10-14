class Solution {
    public int firstUniqChar(String s) {
        int freq[] = new int[26];
        for(int i = 0 ; i < s.length(); i++){
            freq[s.charAt(i) - 'a']++ ;  // lopp frequency bta dega ek bar me har ch ki
        }
        for(int i = 0 ; i < s.length();i++){
            if(freq[s.charAt(i) - 'a'] == 1){ // yeh phla aisa index dkhega jiski freq 1 ke barabar hai vhi unique hai
                return i;
            }
        }
        return -1;
    }
}