class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> ch = new HashSet<>();
        int maxLength=0;
        int left=0;

        for(int right=0;right<s.length();right++){

            while(ch.contains(s.charAt(right))){
                ch.remove(s.charAt(left));
                left++;
            }
            ch.add(s.charAt(right));
            maxLength = Math.max(maxLength,right-left+1);
        }
return maxLength;
    }
}
