void main()
{
int Number=Integer.parseInt(IO.readln("Enter a Number :"));
IO.println(" reverse Number is"+getReverseNumber(Number));
}

String getReverseNumber(int num)
{
    String rev="";
    while(num!=0)
    {
        int digit=num%10;
        rev=rev+digit;
        num=num/10;
    }return rev;
}