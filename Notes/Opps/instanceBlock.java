void main()
{
new Calculate(100, 200);
new Calculate(100, 200);
}

class Calculate
{
    public Calculate(int x,int y)
    {
        this(1.2,1.2);
        IO.println("Sum of two intger s"+(x+y));
    }

    public Calculate(double x,double y)
    {
this("java","Technology");
IO.println("Sum of two double is :"+(x+y));
    }

    public Calculate(String x,String y)
    {
        IO.println("Concatenation of two String is :"+(x+y));

    }
    {
        IO.println("Non static");
    }
}




