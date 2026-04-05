class Solution {
    public String minWindow(String s, String t) {
        if(s==null || t==null||s.length()<t.length()){
            return "";
        }

        Map<Character,Integer> frequencyMap = new HashMap<>();
        for(Character ch:t.toCharArray()){
            frequencyMap.put(ch,frequencyMap.getOrDefault(ch,0)+1);
        }

        int left=0;
        int start=0;
        int minLength=Integer.MAX_VALUE;
        int count = t.length();
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            if(frequencyMap.containsKey(ch)){
                if(frequencyMap.get(ch)>0)count--;
                 frequencyMap.put(ch,frequencyMap.get(ch)-1);
            }
            while(count==0){
               
                if(right-left+1 < minLength){
                     start=left;
                    minLength = right-left+1;
                }
                char leftCh = s.charAt(left);
                if(frequencyMap.containsKey(leftCh)){
                     frequencyMap.put(leftCh,frequencyMap.get(leftCh)+1);
                     if(frequencyMap.get(leftCh)>0)count++;
                }
                left++;
            }
        }

        return minLength==Integer.MAX_VALUE?"":s.substring(start,start+minLength);
    }
}
