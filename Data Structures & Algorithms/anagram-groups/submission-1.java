class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();
        for(String str:strs){
            int arr[]=new int[26];
            for(Character ch:str.toCharArray()){
                arr[ch-'a']++;
            }
            map.putIfAbsent(Arrays.toString(arr),new ArrayList<>());
            map.get(Arrays.toString(arr)).add(str);
        }
result.addAll(map.values());
        return result;
    }


    
}
