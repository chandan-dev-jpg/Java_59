//1124

// Sum = 1 + 1 + 2 + 4 = 8
// Product = 1 × 1 × 2 × 4 = 8

// Since Sum = Product, 1124 is a Spy Number.
void main()
{
    int Number=Integer.parseInt(IO.readln("Enter a Number :"));
    boolean isSpy=isSpyNumber(Number);
    if(isSpy)
    {
IO.println("it is a Spy Number");
    }else{
        IO.println("it is not a Spy Number");
    }
}

boolean isSpyNumber(int num)
{
    int sum=0;
    int product=1;

    while (num!=0) {
        int digit=num%10;
        sum=sum+digit;
        product=product*digit;
        num=num/10;
    }
    return sum==product;
}