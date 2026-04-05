class Solution {
    public String minWindow(String s, String t) {
        if(t==null || s==null || t.length()>s.length()){
            return "";
        }

        Map<Character,Integer> freqMap = new HashMap<>();
        for(Character ch:t.toCharArray()){
            freqMap.put(ch,freqMap.getOrDefault(ch,0)+1);
        }
        int left=0;
        String result="";
        int count=t.length();
        int minLength = Integer.MAX_VALUE;
        int start = 0;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            if(freqMap.containsKey(ch)){
                if(freqMap.get(ch)>0){
                    count--;
                }
                    
                    freqMap.put(ch,freqMap.get(ch)-1);
            }
            while(count==0){
                if(right-left+1 < minLength){
                start = left;
                minLength = right-left+1;
                }
                char leftch=s.charAt(left);
                if(freqMap.containsKey(leftch)){
                freqMap.put(leftch,freqMap.get(leftch)+1);
                   if(freqMap.get(leftch)>0){
                        count++;
                   } 
                   
               
                }
               left++;
            }
        }

        return minLength==Integer.MAX_VALUE?"":s.substring(start,start+minLength);
    }
}
