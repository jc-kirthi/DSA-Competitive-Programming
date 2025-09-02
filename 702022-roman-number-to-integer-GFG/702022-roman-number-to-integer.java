class Solution
{
    public int romanToDecimal(String s) 
    {
        // code here
          int total = 0;

        for (int i = 0; i < s.length(); i++)
        {
            int value = valueOf(s.charAt(i));

           // is next char in range? && is present value < next char value?   
            if (i + 1 < s.length() && value < valueOf(s.charAt(i + 1))) 
            {
                total -= value;
            } 
            else 
            {
                total += value;
            }
        }

        return total;
    }

    // Helper method to get value of each Roman numeral
    private int valueOf(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0; // in case of invalid input
        }
    }
}