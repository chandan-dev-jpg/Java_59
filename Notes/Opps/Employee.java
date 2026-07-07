
class Foo
{
    {
        IO.println("Non Static block");
    }

    public Foo()
    {
        super();
        IO.println("No Argument ");
    }


}

void main()
{
    new Foo();
    new Foo();
}