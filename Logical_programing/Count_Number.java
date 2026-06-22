void main()
{
    int Number=Integer.parseInt(IO.readln("Enter a NUmber :"));
    IO.println("Total Number of digits is :"+Number+" is "+getCountNumber(Number));
}

int getCountNumber(int num)
{
    if(num==0)
    {
        return 1;
    }

    int count=0;

    while(num!=0)
    {
        // int digit=num%10;
        num=num/10;
        count++;
    }
    return count;
}