class Solution {
    public boolean isPalindrome(String s) {
        String[] strs = s.split(" ");
        String str = String.join("",strs);
        str = str.toLowerCase();
        int l = 0;
        int r = str.length()-1;
        while(l<r){
            
            while(l<r && !Character.isLetterOrDigit(str.charAt(l))){
                l++;
            }
            while(l<r && !Character.isLetterOrDigit(str.charAt(r))){
                r--;
            }
            if (str.charAt(l)!=str.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;

    }
}
