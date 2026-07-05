
void main()
{
Product p1=new Product("mn",1);
IO.println(p1);

Product p2=new Product(p1);
IO.println(p2);

p1.setId(10);
IO.println(p1);
IO.println(p2);
}

class Product
{
    private String name;
    private int id;

    public Product(String name,int id)
    {
        this.name=name;
        this.id=id;
    }

    public Product(Product p)
    {
        this.id=p.id;
        this.name=p.name;
    }


    public void setId(int id)
    {
this.id=id;
    }

    public int getId()
    {
     return id;   
    }

    public String toString()
    {
        return "Product [Name "+name+" id "+id+"]";
    }


}