// User function Template for Java
class Solution {
    public static void fizzBuzz(int number) {
        // Write your code here.
        if(number %3==0 && number %5==0)
        System.out.print("FizzBuzz"+"\n");
        else if(number%5==0)
        System.out.print("Buzz \n");
        else if (number %3==0 )
        System.out.print("Fizz\n");
        else
        System.out.println(number);
    }
}