class Solution {
    public String reverseWords(String s) {
                Stack<Character> stack = new Stack<>();
        int count = 0;
        String ans = new String();;

        for(int i =  s.length()-1 ;i>= 0;i--){
            if(s.charAt(i)!= ' '){
                count++;
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i) == ' ' && count != 0 ){
                String temp = new String();
                while(!stack.isEmpty()){
                temp = temp + stack.pop();
                }
                ans = ans +' '+ temp;
                count = 0;  
            }
        }
             if(!stack.isEmpty()){
                String temp = new String();
                while(!stack.isEmpty()){
                temp = temp + stack.pop();
                }
                ans = ans +' '+ temp;
             }
        return ans.substring(1,ans.length());
    }
}