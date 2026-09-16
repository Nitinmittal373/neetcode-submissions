class Solution {
    public boolean isPalindrome(String s) {
        String s1=s.toLowerCase();
        String s2="";
        for(int i=0;i<s1.length();i++){
            if(Character.isLetterOrDigit(s1.charAt(i))){
                s2+=s1.charAt(i);
            }
        }
        int k=0;
        int j=s2.length()-1;
        while(k<j){
            if(s2.charAt(k)!=s2.charAt(j)){
                return false;
            }
            k++;
            j--;
        }
        
        return true;
    }
}
