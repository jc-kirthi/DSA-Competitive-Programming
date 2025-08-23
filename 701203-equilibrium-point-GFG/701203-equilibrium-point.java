class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        int n = arr.length;
        long total = 0;
        
        for (int i = 0; i < n; i++) {
            total += arr[i];
        }
        
        long leftSum = 0;
        for (int i = 0; i < n; i++) {
            total -= arr[i]; 
            if (leftSum == total) {
                return i;  // equilibrium index found
            }
            
            leftSum += arr[i];
        }
        
        return -1; // no equilibrium
    }
}
