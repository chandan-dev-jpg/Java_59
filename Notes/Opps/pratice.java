void main()
{
  Laptop lap=new Laptop("lap1", 90000);
  
  lap.getName();
lap.getPrice();
IO.println(lap);

lap.setName("lap2");
lap.setPrice(20000);
IO.println(lap);
}

public class Laptop {

  String name;
  double price;

  public Laptop(String name,double price)
  {
this.name=name;
this.price=price;
  }   

  public void setName(String name)
  {
    this.name=name;
  }

  public String getName()
  {
    return name;
  }

  public void setPrice(double price)
  {
    this.price=price;
  }

  public double getPrice()
  {
    return price;
  }

  public String toString()
  {
    return "Laptop[name "+name+" Price "+price+"]";
  }
}