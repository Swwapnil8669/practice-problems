class Solution {
    public String longestPalindrome(String s) {
        if(s == null || s.length() == 0){
            return "";
        }

        int start =  0 ;
        int end = 0;
        for(int i = 0 ; i<s.length();i++){
            int length1 = checkPL(s,i,i);
            int length2 = checkPL(s,i,i+1);
            int fLen = Math.max(length1,length2);
            if(fLen> end - start){
                start = i - (fLen -1 )/2;
                end = i + fLen /2;
            }
        }

        return s.substring(start,end+1);

        
    }

    public int checkPL(String s, int L ,int R){
            while(L>=0 && R< s.length() && s.charAt(L) == s.charAt(R) ){
                L--;
                R++;
            }
            return R-L-1;
        }
}