class Solution {
    public int getSecondLargest(int[] arr) {
        int largest = -1;
        int secondLargest = -1;

        for (int num : arr) 
        {
            if (num > largest)
            {
                secondLargest = largest; // update second largest
                largest = num;           // update largest
            } 
            else if (num < largest && num > secondLargest) // checking between 1st(<) and (>)3rd element
            {
                secondLargest = num;     
            }
        }

        return secondLargest;
    }
}
