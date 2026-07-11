public class Customer {
   
    
    private int id;
    private String name;
    private long phone;
    private String cityName;


    public Customer(int id,String name,long phone,String cityName)
    {
        this.id=id;
        this.name=name;
        this.phone=phone;
        this.cityName=cityName;
    }

    public static Customer getCustomer(int id, String name, String phone, String city)
    {
        return new Customer(id, name, phone, city);
    }
    }

void main()
{

}
