// wiggyCouponCodeSystem
// Easy
// Core Java • Static, Instance Members • Instance Methods
// 20 Points
// Description
// Coupon Application Eligibility Module in Swiggy
// Description:
// Coupons can be applied to a Swiggy order only if:
// The total order amount is greater than Rs. 200.
// The user is logged in.(Take user ID fixed by developer)
// The coupon code is valid.(Take coupon code fixed by developer)

// Task:
// Create a class Coupon with:
// int totalAmount
// boolean isLoggedIn
// boolean isValidCoupon

// Write a method applyCoupon() that returns:
// - "Coupon Applied" if all conditions are met.
// - "Not Eligible" with a specific reason otherwise.
// Examples
// Example 1:

// Input

// totalAmount = 350 
// isLoggedIn = true 
// isValidCoupon = true
// Output

// Coupon Applied
// Example 2:

// Input

// totalAmount = 150 
// isLoggedIn = true 
// isValidCoupon = true
// Output

// Not Eligible: Order amount must be greater than Rs 200.
// Constraints
// 1. totalAmount Constraints
// Must be a non-negative integer.
// Must be greater than Rs. 200 to be eligible.
// If totalAmount <= 200, coupon cannot be applied.
// 2. isLoggedIn Constraints
// Must be true (user must be logged in).
// User ID is assumed to be fixed/stored by the developer.
// If isLoggedIn is false ->Not Eligible: User not logged in.
// 3. isValidCoupon Constraints
// Must be true (coupon code must be verified by the system).
// Coupon code is assumed to be set by the developer.
// If isValidCoupon is false ->Not Eligible: Invalid coupon code.
// 4. Output Constraints
// Output must be one of the following:
// "Coupon Applied"
// "Not Eligible: Order amount too low"
// "Not Eligible: User not logged in"
// "Not Eligible: Invalid coupon code"
// 5. Method Constraints
// applyCoupon() must check conditions in logical order:
// Check amount
// Check login status
// Check coupon validity
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
    Coupon c=new Coupon();
c.totalAmount=Integer.parseInt(IO.readln());
c.isLoggedIn=Boolean.parseBoolean(IO.readln());
c.isValidCoupon=Boolean.parseBoolean(IO.readln());
IO.println(c.applyCoupon());

}

class Coupon{
    int totalAmount;
    boolean isLoggedIn;
    boolean isValidCoupon;

    String applyCoupon()
    {
        if(isLoggedIn&&isValidCoupon&&totalAmount>200)
        {
return " Coupon Applied ";
        }else{
            return "Not Eligible";
        }
    }
}