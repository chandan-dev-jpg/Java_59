void main()
{
int Number=Integer.parseInt(IO.readln("Enter a Number :"));
IO.println("Largest Number is :"+getLargestNumber(Number));
}

int getLargestNumber(int num)
{
    int Min=9;
    while (num!=0) {
        int digit=num%10;
        if(Min>=digit)
        {
            Min=digit;
        }
        num=num/10;
    }
    return Min;
}