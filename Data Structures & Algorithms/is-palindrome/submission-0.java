class Solution {
    public boolean isPalindrome(String s) {
        int low=0;int high=s.length()-1;

        while(low<high){
            char start = s.charAt(low);
            char end = s.charAt(high);
            
            if (!Character.isLetterOrDigit(start)) {
                low++;
                continue;
            }
            if (!Character.isLetterOrDigit(end)) {
                high--;
                continue;
            }

            if(Character.toLowerCase(start) != Character.toLowerCase(end)){
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
}
