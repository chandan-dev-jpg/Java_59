 class Engine {
    

    private String type;
    Engine(String type)
    {
this.type=type;
    }

 public String toString()
 {
    return "Engine [Type "+type+"]";
 }   

}



class Car
{
private double price;
private final Engine engine;

Car(double price)
{
this.price=price;
this.engine=new Engine("nnm");

}

public String toString()
{
    return "Car [Price "+price+" engine"+engine+"]";
}


}

public class Test
{

    void main()
    {
        Car c=new Car(100);
        IO.println(c);
    }
}