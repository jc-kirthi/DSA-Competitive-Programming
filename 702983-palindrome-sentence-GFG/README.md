# [Palindrome Sentence](https://www.geeksforgeeks.org/problems/string-palindromic-ignoring-spaces4723/1?_gl=1*1afpwi0*_up*MQ..*_gs*MQ..&gclid=CjwKCAjwiNXFBhBKEiwAPSaPCQceOqRmlfdChV-bgno9_tSVcf8swx-tYCaRDc5qDq80i5qGyO7ItRoCusgQAvD_BwE&gbraid=0AAAAAC9yBkC5K-1LJzpztKjQWn7Xr_xSa)
## Easy
Given a single string&nbsp;s, the task is to check if it is a palindrome sentence or not.A palindrome sentence is a sequence of characters, such as word, phrase, or series of symbols that reads the same backward as forward after converting all uppercase letters to lowercase and removing all non-alphanumeric characters (including spaces and punctuation).
Examples:
Input: s = "Too hot to hoot"
Output: true
Explanation: If we remove all non-alphanumeric characters and convert all uppercase letters to lowercase, string s will become "toohottohoot" which is a palindrome.
Input: s = "Abc 012..## 10cbA"
Output: true
Explanation: If we remove all non-alphanumeric characters and convert all uppercase letters to lowercase, string s will become "abc01210cba" which is a palindrome.
Input: s = "ABC $. def01ASDF"Output: falseExplanation: The processed string becomes "abcdef01asdf", which is not a palindrome.
Constraints:1 ≤ s.length() ≤ 106