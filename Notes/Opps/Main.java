// int Fibonacci series up to N terms using a for loop
// Easy
// Core Java • Loops • for
// 20 Points
// Description
// Problem: Print Fibonacci series up to N terms using a for loop

// This program prints the first N terms of the Fibonacci series using a 'for' loop.

// Steps:
// 1. Read integer N from the user (number of terms).
// 2. Initialize: first = 0, second = 1
// 3. Use a for loop that runs N times:
// - Print the current term
// - Calculate next = first + second
// - Update: first = second, second = next
// 4. Stop after N terms

// Note:
// - The first two terms are always 0 and 1.
// - Works only for N >= 1

// Note:
// - Make sure to handle invalid input (like N <= 0).
// - Can also be used to explain recursion or dynamic programming later.
// Examples
// Example 1:

// Input

// A single integer N representing the number of terms to print.
// Output

// Print N space-separated Fibonacci numbers.

// If N <= 0, print:

// Invalid input. Please enter a positive integer.
// Example 2:

// Input

// 5
// Output

// 0 1 1 2 3
// Explanation

// The first two Fibonacci numbers are always:

// first = 0

// second = 1

// Each next number is calculated as:

// next = first + second

// After printing a term, update:

// first = second
// second = next

// Continue this for N terms.
// Constraints
// 1 <= N <= 50
// Use only loops (no recursion).
// Fibonacci values must fit within 64-bit integer range.
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
    int num=Integer.parseInt(IO.readln());
    int f=0;
    int s=1;
    for(int i=1;i<=num;i++)
        {
            // IO.println(f);
            IO.println(f);
            int next=f+s;
            f=s;
            s=next;
    }
}