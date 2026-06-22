void main()
{
int Number=Integer.parseInt(IO.readln("Enter a Number :"));
IO.println("Total Product Number is :"+getProductOfNumber(Number));
}

int getProductOfNumber(int num)
{

    int product=1;
    while(num!=0)
    {
        int digit=num%10;
        product=product*digit;
        num=num/10;
    }
    return product;
}