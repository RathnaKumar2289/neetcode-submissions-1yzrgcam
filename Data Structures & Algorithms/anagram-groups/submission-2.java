class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();

        for(String str:strs){
            int arr[] = new int[26];
            for(char ch:str.toCharArray()){
                arr[ch-'a']++;
            }

            String key = Arrays.toString(arr);
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(str);
        }

        result.addAll(map.values());
        return result;
    }
}
