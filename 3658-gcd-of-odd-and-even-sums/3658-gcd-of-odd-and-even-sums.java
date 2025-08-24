class Solution 
{
    public int gcdOfOddEvenSums(int n) 
    {
        /** 
        int sumOdd=0;
        int sumEven=0;
        int gcd=1;

         int sumOdd = n * n;
        int sumEven = n * (n + 1); 

        for (int i = 1; i <= 2*n; i += 2) {
            sumOdd += i;
        }

        for (int i = 2; i <= 2*n; i += 2) 
            sumEven += i;

            for(int k=1;k<=Math.min(sumOdd, sumEven);k++){
                if(sumOdd%k ==0 && sumEven%k==0)
                gcd=k;
            }
            return gcd; */
             int sumOdd = n^2;
    int sumEven = n*(n+1);
    
    return n;
    }
}
   