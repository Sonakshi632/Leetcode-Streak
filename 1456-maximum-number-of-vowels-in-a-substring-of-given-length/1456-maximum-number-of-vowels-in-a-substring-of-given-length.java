class Solution {
    public int maxVowels(String s, int k) {

        int maxVowel = 0;
        int count = 0;

        int left = 0;

        for(int right = 0; right < s.length(); right++){

            // Add current character (right pointer enters window)
            if(isVowel(s.charAt(right))){
                count++;
            }


            // Window size becomes k
            if(right - left + 1 > k){

                // Remove left character
                if(isVowel(s.charAt(left))){
                    count--;
                }

                left++;
            }


            // Update answer
            maxVowel = Math.max(maxVowel, count);
        }

        return maxVowel;
    }


    private boolean isVowel(char ch){

        return ch=='a' || ch=='e' || ch=='i' ||
               ch=='o' || ch=='u';
    }
}