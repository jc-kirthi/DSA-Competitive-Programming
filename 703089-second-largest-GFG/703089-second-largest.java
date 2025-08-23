class Solution {
    public int getSecondLargest(int[] arr) {
        int largest = -1;
        int secondLargest = -1;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest; // update second largest
                largest = num;           // update largest
            } else if (num < largest && num > secondLargest) {
                secondLargest = num;     // update if smaller than largest but bigger than secondLargest
            }
        }

        return secondLargest;
    }
}
