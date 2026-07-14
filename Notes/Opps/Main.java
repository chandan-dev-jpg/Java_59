// import java.beans.VetoableChangeListenerProxy;

void main()
{
    String CartYpe=IO.readln();
    String model=IO.readln();
    String color=IO.readln();
Car c=new Car(CartYpe,color,model);
c.display();

}

class Vehicle
{
String CartYpe;
public Vehicle(String CartYpe)
{
this.CartYpe=CartYpe;
}
}

class Car extends Vehicle{
String color;
String model;


public Car(String CartYpe,String color,String model)
{
    super(CartYpe);
    this.color=color;
    this.model=model;
}


public void display()
{
    IO.println("Car Type :"+CartYpe);
    IO.println("Car Color :"+color);
    IO.println("Car Model : "+model);
}
}