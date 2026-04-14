class Solution {
    public List<String> letterCombinations(String digits) {
        String map[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        if(digits==null || digits.length()<1){
                return new ArrayList<>();
        }    
        List<String> result = new ArrayList<>();
        
        helper(map,result,digits,0,"");
        return result;
    }

    void helper(String[] map,List<String> result,String digits,int index,String ch){
        if(digits.length()==index){
            result.add(ch);
            return;
        }
        
        String value = map[digits.charAt(index)-'0'];
        for(int i=0;i<value.length();i++){
            helper(map,result,digits,index+1,ch+value.charAt(i));
        }
    }
}
