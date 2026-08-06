class Parent 
{
    public void show() 
    { 
      IO.println("Parent");
    }
}
class Child extends Parent 
{
    public void show() 
    { 
       IO.println("Child"); 
    }
}
public class Main 
{
   void main()
    {
        Child obj = new Child();
        obj.show();
    }
}