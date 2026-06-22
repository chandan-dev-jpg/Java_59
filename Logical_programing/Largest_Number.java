void main()
{
int Number=Integer.parseInt(IO.readln("Enter a Number :"));
IO.println("Largest Number is :"+getLargestNumber(Number));
}

int getLargestNumber(int num)
{
    int Max=0;
    while (num!=0) {
        int digit=num%10;
        if(Max<=digit)
        {
            Max=digit;
        }
        num=num/10;
    }
    return Max;
}