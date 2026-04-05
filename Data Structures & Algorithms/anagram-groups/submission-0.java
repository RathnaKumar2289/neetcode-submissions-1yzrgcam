class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        if(strs.length<2)  {
           result.add(Arrays.asList(strs)) ;
           return result;
        }
        boolean visited[] = new boolean[strs.length];
        for(int i=0;i<strs.length;i++){
            List<String> anagram = new ArrayList<>();
            if(visited[i]){continue;}
            anagram.add(strs[i]);
            visited[i]=true;
                for(int j=i+1;j<strs.length;j++){
                    if(isValidAnagram(strs[i],strs[j])&&!visited[j]){
                        anagram.add(strs[j]);
                        visited[j]=true;
                    }
                }

                result.add(anagram);
        }
        return result;
    }


    boolean isValidAnagram(String one,String two){
        if(one.length()!=two.length()){
            return false;
        }
        Map<Character,Integer> map = new HashMap<>();
        for(Character ch:one.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }

        for(Character ch:two.toCharArray()){
            if(map.containsKey(ch) && map.get(ch)>0){
                map.put(ch,map.get(ch)-1);
            }else{
                return false;
            }
        }

        return true;
    }
}
