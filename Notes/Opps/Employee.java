void main()
{
    Dog d=new Dog("raju", 10, 2.3);
    IO.println(d);
}

class Dog
{
private String name;
private int age;
private double height;

public Dog(String name,int age,double height)

{
    this.name=name;
    this.age=age;
    this.height=height;


    if(name.equals(null)||name.isBlank()||age<=0||height<=0)
    {
IO.println("Invalid Data");
return;
    }

}

public String toString()
{
    return "Dog [Name"+name+" Age "+age+" height"+height+"]";

}
}