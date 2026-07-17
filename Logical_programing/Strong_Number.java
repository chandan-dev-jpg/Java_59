void main()

{
int c=Integer.parseInt(IO.readln());
switch (c) {
    case 1->
    {
        String name=IO.readln();
        String d=IO.readln();
      Employee e=new Employee(name);
      e.display();

    }
    case 2->
    {
        String name=IO.readln();
        String d=IO.readln();
      Manager e=new Manager(name,d);

e.d();
    }
}

}

class Employee
{
    String name;
    Employee(String name)
    {
        this.name=name;
    }
    void display()
    {
        IO.println(name);
    }

}
class Manager extends Employee
{
    String dept;
    
    Manager(String name,String dept)
    {
        super(name);
        this.dept=dept;
    }
    void d()
    {
        IO.println(name);
        IO.println(dept);
    }
}