# [Roman Number to Integer](https://www.geeksforgeeks.org/problems/roman-number-to-integer3201/1?_gl=1*1afpwi0*_up*MQ..*_gs*MQ..&gclid=CjwKCAjwiNXFBhBKEiwAPSaPCQceOqRmlfdChV-bgno9_tSVcf8swx-tYCaRDc5qDq80i5qGyO7ItRoCusgQAvD_BwE&gbraid=0AAAAAC9yBkC5K-1LJzpztKjQWn7Xr_xSa)
## Easy
Given a string s in Roman number format, your task is to convert it to an integer. Various symbols and their values are given below.Note: I = 1, V = 5, X = 10, L = 50, C = 100, D = 500, M = 1000
Examples:
Input: s = "IX"
Output: 9Explanation: IX is a Roman symbol which represents 10 – 1 = 9.
Input: s = "XL"
Output: 40Explanation: XL is a Roman symbol which represents 50 – 10 = 40.
Input: s = "MCMIV"Output: 1904Explanation: M is 1000, CM is 1000 – 100 = 900, and IV is 4. So we have total as 1000 + 900 + 4 = 1904.
Constraints:1 ≤ roman number ≤ 3999s[i] belongs to [I, V, X, L, C, D, M]