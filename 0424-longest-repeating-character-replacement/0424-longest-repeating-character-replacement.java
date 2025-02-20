class Solution {
    public int characterReplacement(String s, int k) {
        int freq[] = new int[26];
        int max = 0;
        int l = 0;
        int len = 0;
        int ans = 0;
        
        for(int r = 0; r<s.length() ; r++){
            freq[s.charAt(r) - 'A']++;
            max = Math.max(max,freq[s.charAt(r) - 'A']);
            len = r-l+ 1;

            while(len - max > k){
                 freq[s.charAt(l) - 'A']--;
                 l++;
                 len = r-l+ 1;
            }
            // ans = Math.max(len,ans);
        }
        return len;
    }
}