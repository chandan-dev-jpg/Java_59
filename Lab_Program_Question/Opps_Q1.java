// // If you're learning **Core Java/OOP**, these are the **best logic-building programming questions** in order from beginner to advanced.

// ## Level 1: Basic Logic

// 1. Print "Hello World"
// void main()
// {
//     IO.println("Hello World");
// }
// 2. Add two numbers
// void main()
// {
//     int n=20;
//     int n1=20;
//     int r=n+n1;
//     IO.println("Sum of two number is :"+r);
// }
// 3. Find the average of three numbers

// void main(){
//     int n1=10;
//     int n2=20;
//     int n3=30;
//     int average=(n1+n2+n3)/3;
//     IO.println(average);
// }

// 4. Swap two numbers (with and without third variable)

// void main()
// {
//     int n1=10;
//     int n2=50;
//     IO.println(n1);
//     IO.println(n2);
    
//     // n1=n2;
//     n1=n1+n2;
//     n2=n1-n2;
//     n1=n1-n2;
//     IO.println(n1);
//     IO.println(n2);



// }

// 5. Find the largest of two numbers

// void main()
// {
// int n1=20;
// int n2=10;
// int r=(n1>=n2)?n1:n2;
// IO.println("Largest Number is : "+r);
// }

// 6. Find the largest of three numbers
// void main()
// {
//     int n1=30;
//     int n2=20;
//     int n3=40;
//     int result = (n1 >= n2 && n1 >= n3) ? n1
//             : (n2 >= n1 && n2 >= n3) ? n2
//             : n3;
//     IO.println(result);

// }
// 7. Check even or odd
// void main()
// {

//     int num=Integer.parseInt(IO.readln("Enter Number NUmber :  "));
//     if(num%2==0)
//     {
//         IO.println(num+" is EVEN ");
//     }else{
//         IO.println(num+" is ODD ");
//     }
// }
// 8. Check positive, negative, or zero
// void main()
// {
//     int num=Integer.parseInt(IO.readln("Enter a number : "));
//     if(num>0)
//     {
// IO.println(num+" is Positive  ");
//     }
//     else if(num==0)
//     {
//         IO.println(num+"is zero");
//     }
//     else {
//         IO.println(num+" is negative ");
//     }
// }
// 9. Find the square and cube of a number

// void main()
// {
//     int num=Integer.parseInt(IO.readln("Enter Number : "));
//     IO.println(num+"Square is "+(num*num));
// }

// 10. Calculate simple interest(SI = (P × R × T) / 100)

// void main()
// {
//     int p=Integer.parseInt(IO.readln("Enter a Number :"));
//     int R=Integer.parseInt(IO.readln("Enter a Number :"));
//     int T=Integer.parseInt(IO.readln("Enter a Number :"));

//     double si=(p*R*T)/100;

//     IO.println(" SImple Interest is : "+si);

// }

// ---

// ## Level 2: Conditional Statements

// 11. Check leap year

// void main()
// {
//     int year=Integer.parseInt(IO.readln("Enter year : "));

//     if((year%4==0 &&year%100!=0 )|| (year%400==0))
//     {
// IO.println("it is leap year");
//     }else{
//         IO.println("Not a leap year");

//     }
// }

// 12. Find the greatest of three numbers
// 13. Grade calculator
// 14. Electricity bill calculator

// 15. Calculator using switch-case
// 16. Voting eligibility
// 17. Discount calculator
// 18. Profit and loss
// 19. Income tax calculator
// 20. Character is vowel or consonant

// ---

// ## Level 3: Loops

// 21. Print 1 to N



void main()
{
    int n=10;
    for(int i=0;i<=n;i++)
    {
IO.println(i);
    }
}
// 22. Print N to 1
// 23. Sum of first N numbers
// 24. Multiplication table
// 25. Factorial
// 26. Reverse a number
// 27. Palindrome number
// 28. Armstrong number
// 29. Strong number
// 30. Prime number

// ---

// ## Level 4: Number Logic

// 31. Count digits
// 32. Sum of digits
// 33. Product of digits
// 34. Largest digit
// 35. Smallest digit
// 36. Fibonacci series
// 37. GCD (HCF)
// 38. LCM
// 39. Perfect number
// 40. Neon number

// ---

// ## Level 5: Pattern Programming

// 41. Square pattern
// 42. Rectangle pattern
// 43. Right triangle
// 44. Inverted triangle
// 45. Pyramid
// 46. Number pyramid
// 47. Floyd's triangle
// 48. Diamond pattern
// 49. Hollow square
// 50. Butterfly pattern

// ---

// ## Level 6: Arrays

// 51. Find maximum element
// 52. Find minimum element
// 53. Sum of array elements
// 54. Average of array
// 55. Reverse array
// 56. Second largest element
// 57. Sort array
// 58. Search an element
// 59. Remove duplicates
// 60. Merge two arrays

// ---

// ## Level 7: Strings

// 61. Reverse a string
// 62. Palindrome string
// 63. Count vowels
// 64. Count words
// 65. Remove spaces
// 66. Find duplicate characters
// 67. Check anagram
// 68. Change case
// 69. Count frequency of characters
// 70. Replace characters

// ---

// ## Level 8: OOP Logic

// 71. Student class
// 72. Employee salary calculator
// 73. Bank Account
// 74. ATM System
// 75. Library Management
// 76. Hotel Booking
// 77. Vehicle class
// 78. Rectangle/Circle area
// 79. Product billing
// 80. Electricity bill using OOP

// ---

// ## Level 9: Real Interview Programs

// 81. ATM Machine
// 82. Banking System
// 83. Employee Management
// 84. Student Result System
// 85. Online Shopping Cart
// 86. Hospital Management
// 87. Movie Ticket Booking
// 88. Bus Reservation
// 89. Inventory Management
// 90. Restaurant Billing

// ---

// ## Level 10: Advanced Logic

// 91. Tic-Tac-Toe
// 92. Snake Game
// 93. Number Guessing Game
// 94. Sudoku Solver
// 95. Currency Converter
// 96. Expense Tracker
// 97. Quiz Application
// 98. Calculator with GUI
// 99. File Handling Project
// 100. Student Management System

// ### Recommended Practice Order

// 1. Variables & Operators (1–10)
// 2. `if-else` & `switch` (11–20)
// 3. Loops (21–40)
// 4. Patterns (41–50)
// 5. Arrays (51–60)
// 6. Strings (61–70)
// 7. OOP (71–80)
// 8. Mini Projects (81–100)

// Since you're preparing for **Java Full Stack interviews**, solving these 100 questions in this order will build a strong foundation in programming logic and OOP.
