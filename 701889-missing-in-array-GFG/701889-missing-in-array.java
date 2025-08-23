class Solution {
    int missingNum(int arr[]) {
        int n = arr.length + 1;  // +1 beacuse 21 element is missing
        
        //sum of first n natural numbers formula(as we start from 1 to n)
        long total = (long)n * (n + 1) / 2;  // use long to avoid overflow

        long sum = 0;
        for (int num : arr) {
            sum += num; // sum of existing elements
        }

        return (int)(total - sum);  // cast back to int at the end
    }
}
