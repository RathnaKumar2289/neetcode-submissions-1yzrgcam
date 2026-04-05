class Solution {
    public int characterReplacement(String s, int k) {
       int left=0;
       int maxFreq = 0;
       int result = 0;
       Map<Character,Integer> map = new HashMap<>();
       for(int right=0;right<s.length();right++){

            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
            maxFreq = Math.max(map.get(s.charAt(right)),maxFreq);
            while((right-left+1)-maxFreq>k){
                  char l=  s.charAt(left);
                    map.put(l,map.get(l)-1);
                    left++;
            }
            result = Math.max((right-left+1),result);

       }
       
        
       return result;

    }
}
