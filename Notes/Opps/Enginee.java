public class Enginee {
    

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
private final Enginee engine;

Car(double price)
{
this.price=price;
this.engine=new Enginee("nnm");

}

public String toString()
{
    return "Car [Price "+price+" engine"+engine+"]";
}
}


void main()
{
    Car c=new Car(100);
    IO.println(c);
}