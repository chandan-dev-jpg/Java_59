class Test
{
    public Test(int x)
    {
        this("java");
        IO.println("int x value is "+x);

    }
    public Test(String y)
    {
        this(90.0f);
        IO.println("String y value is "+y);
    }
    public Test(float f)
    {
        super();
        IO.println("Float Value is "+f);
    }
}

void main()
{
    new Test(16); 
}