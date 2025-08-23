class Solution {
    int missingNum(int arr[]) {
        int n = arr.length + 1;   
        long total = (long)n * (n + 1) / 2;  // use long to avoid overflow

        long sum = 0;
        for (int num : arr) {
            sum += num;
        }

        return (int)(total - sum);  // cast back to int at the end
    }
}
