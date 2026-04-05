class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        int left=0;
        int count=s1.length();

        int[] freq = new int[26];

        for(char ch:s1.toCharArray()){
            freq[ch-'a']++;
        }
        for(int right=0;right<s2.length();right++){
            if(freq[s2.charAt(right)-'a']-- > 0){
                count--;
            }

            if(count==0) return true;

            if(right-left+1 == s1.length()){
                if(freq[s2.charAt(left)-'a']++ >=0){
                    count++;
                }
                 left++;
            }
           
        }

        return false;
    }
}
