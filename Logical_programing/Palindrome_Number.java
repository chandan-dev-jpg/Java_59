void main()
{
int Number=Integer.parseInt(IO.readln("Enter a Number :"));
boolean isPalindrome=isPalindromeNumber(Number);
if(isPalindrome)
{
    IO.println("it is a Palindrome Number");
}else{
    IO.println("it is a  not Palindrome Number");

}
}

boolean isPalindromeNumber(int num)
{
    int rev=0;
    int temp=num;
    while(num!=0)
    {
        int digit=num%10;
        rev=rev*10+digit;
        num=num/10;
    }
    return temp==rev;
}