class Solution {
    boolean isPalindrome(String s) {
        //creates a buffer copy
        StringBuilder sb = new StringBuilder(s);
        //toString() converts buffer back to string
        if(s.equals(sb.reverse().toString()))
        return true;
        else
        return false;
    }
}
