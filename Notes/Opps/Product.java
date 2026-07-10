void main()
{

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
IO.println("Name Cannot be null or empty");
return;
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
}
