void main()
{

    String name=IO.readln("Enter a Product Name :");
    int id=Integer.parseInt(IO.readln("Enter Product Id :"));
    double price=Double.parseDouble(IO.readln("Enter a product price :"));
    Product p=new Product(name, id, price);

    IO.println(p);

}

public class Product
{
    private String name;
    private int id;
    private double price;

    public Product(String name,int id,double price)
    {

if(name.equals("null")||name.isBlank())
    {
System.out.println("Name Cannot be null or empty");
System.exit(0);
    }   
    else if(id<=0)
    {
        IO.println("id cannot be 0 or negative");
        return;
        
    }
    else if(price<=0)
        {
        IO.println("price cannot be 0 or negative");
        return;

    }
    
    this.name=name;
        this.id=id;
        this.price=price;
    }

    public String toString()
    {
        return "Product [Name"+name+" id "+id+" price"+price+"]";
    }
}
