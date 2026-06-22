void main()
{
int Number=Integer.parseInt(IO.readln("Enter a Number :"));
IO.println("Sum of all digits are "+getSumOfDigit(Number));
}

int getSumOfDigit(int num)
{
int sum=0;
while(num!=0)
{
    int digit=num%10;
    sum=sum+digit;
    num=num/10;

}
return sum;
}