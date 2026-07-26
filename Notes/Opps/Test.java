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

Car(double price,Engine engine)
{
this.price=price;
this.engine=engine;

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
        Engine e=new Engine("k");
        Car c=new Car(100,e);
        IO.println(c);
        Car b=new Car(200,e);
        IO.println(b);
    }
}