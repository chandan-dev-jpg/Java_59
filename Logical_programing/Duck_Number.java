void main()
{
int Number=Integer.parseInt(IO.readln("Enter a Number :"));
boolean Isduck=isDuck(Number);
if(Isduck)
{
    IO.println("It is a Duck Number");
}else{

    IO.println("it is not a Duck Number");
}
}

boolean isDuck(int num)
{


    boolean hasZero=false;

    while(num!=0)
    {
        int digit=num%10;

        if(digit==0)
        {
hasZero=true;
break;
        }
        num=num/10;

    }
    return hasZero;



}