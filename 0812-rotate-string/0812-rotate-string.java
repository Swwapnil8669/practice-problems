class Solution {
    public boolean rotateString(String s, String goal) {
         for (int i = 0; i < s.length(); i++) {
            s = rotation(s); // Corrected: Function now returns a new rotated string
            if (s.equals(goal)) { // Corrected: Use .equals() for string comparison
                return true;
            }
        }
        return false;
    }

    public String rotation(String s) {
        return s.substring(1) + s.charAt(0); // Corrected: Properly rotates the string
    }
}