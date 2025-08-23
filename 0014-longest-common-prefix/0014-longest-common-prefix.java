class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0]; // 1st one is checked in others

        for (int i = 1; i < strs.length; i++) 
        {
            while (strs[i].indexOf(prefix) != 0) //checks if prefix==that string (==0 when first position matches) 
            {
                //If the current string does not start with prefix keep shortening prefix by removing the last character.
                prefix = prefix.substring(0, prefix.length() - 1); 
                if (prefix.isEmpty())
                 return "";
            }
        }

        return prefix;
    }
}
