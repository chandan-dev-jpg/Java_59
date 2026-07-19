
// 18 / 25
// Description
// Submissions
// Leaderboard
// Print the multiplication table of a number using a for loop
// Easy
// Core Java • Loops • for
// 20 Points
// Description
// Problem: Print the multiplication table of a number using a for loop
// Steps:
// 1. Read the number from the user.
// 2. Use a for loop that runs from i = 1 to i <= 10.
// 3. In each iteration, calculate and print: number × i = result.
// 4. Loop ends when i > 10.

// Note:
// - Works for positive, negative, or zero input.
// - Output shows multiplication in standard table format.



// Note:
// - The loop index 'i' represents the multiplier.
// - Very useful for understanding counting and iteration with 'for' loops.
// Examples
// Example 1:

// Input

// A single integer n
// Output

// n x 1 = result 
// n x 2 = result 
// ... 
// n x 10 = result
// Example 2:

// Input

// 5
// Output

// 5 x 1 = 5 
// 5 x 2 = 10 
// 5 x 3 = 15 
// 5 x 4 = 20 
// 5 x 5 = 25 
// 5 x 6 = 30 
// 5 x 7 = 35 
// 5 x 8 = 40 
// 5 x 9 = 45 
// 5 x 10 = 50
// Explanation

// This program prints the multiplication table of a number from 1 to 10.
// It uses a 'for' loop to multiply the number with values from 1 to 10 and displays the result in a formatted way.
// Constraints
// nput must be an integer.
// Valid for all integers: negative, zero, positive.
// Loop must run exactly 10 times (1 to 10).
// Output must match the format:
// n x i = result
// Execution Limits
// Code Size
// ≤ 1 MB

// Input Size
// ≤ 256 KB

// Time Limit
// 30 seconds

// Output Size
// ≤ 2 MB

// These limits apply to all programming languages.


// Compiler Rules & Restrictions
// Java


void main()
{
    int num=Integer.parseInt(IO.readln("Enter a Number :"));
    
    for(int i=1;i<=10;i++)
    {
IO.println(num+ " X "+i+" = "+(num*i));
    }
}