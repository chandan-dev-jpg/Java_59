void main()
{
Student s=new Student();

String name=IO.readln();
int rollNo=Integer.parseInt(IO.readln());
s.setName(name);
s.setRoll(rollNo);
s.display();
}

class Person
{
String name;
void setName(String name)
{
this.name=name;
}
}

class Student extends Person{
int rollNo;
void setRoll(int rollNo)
{
    this.rollNo=rollNo;
}
public void display()
{
    IO.println("Name is : "+name);
    IO.println("Roll No : "+rollNo);
}

}