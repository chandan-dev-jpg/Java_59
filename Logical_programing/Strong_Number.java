// A Strong Number is a number whose sum of the factorials of its digits is equal to the original number.

// Example: 145

// Digits: 1, 4, 5

// 1! = 1
// 4! = 24
// 5! = 120

// Sum of factorials:

// 1 + 24 + 120 = 145
void main()
{
int Number=Integer.parseInt(IO.readln("Enter a Number :"));
boolean Isstrong=isStrong(Number);
if(Isstrong)
{
    IO.println("it is a Strong Number");
}else{
    IO.println("it is not a Strong Number");
}
}
boolean isStrong(int num)

{
    int temp=num;
    int sum=0;
    while(num!=0)
    {
        int digit=num%10;
        sum=sum+getStringNumber(digit);
        num=num/10;
    }
    return temp==sum;

}
    public static int getStringNumber(int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact * i;
        }
        return fact;
    }