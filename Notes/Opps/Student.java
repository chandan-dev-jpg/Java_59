public class Student {
   
    private int rollNo;
    private String name;
    public Student(int rollNo,String name)
    {
this.name=name;
this.rollNo=rollNo;
    }
    

    public void display()
    {
        IO.println("Name is : "+name);
        IO.println("RollNo is : "+rollNo);
    }
    
}
void main()
{
    
String name=IO.readln("ENter a Name :");
int rollNo=Integer.parseInt(IO.readln("ENter a Rollno :"));
Student s=new Student(rollNo,name);
s.display();
}
