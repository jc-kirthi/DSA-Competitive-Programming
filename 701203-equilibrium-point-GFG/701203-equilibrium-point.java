class Solution 
{
        public static int findEquilibrium(int arr[])
    {
        int n = arr.length;
        long total = 0;
        
        for (int i = 0; i < n; i++) {
            total += arr[i]; //sum of all the elements in the array
        }

        // sum of all elements - sum of first i elements == remaining of the total -----> equilibrium
        long leftSum = 0;
        for (int i = 0; i < n; i++)
            {
            total -= arr[i]; //removing elements
            if (leftSum == total) //checking if 1st half == 2nd half(as total is reduced)
            {
                return i;  // equilibrium index found
            }
            
            leftSum += arr[i]; //increasing the 1st half
        }
        
        return -1; // no equilibrium
    }
}
