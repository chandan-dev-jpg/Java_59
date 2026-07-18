void main()
{
Customer c=new Customer(null, 0);
CardType d=CradsOffer.getOfferCard(c);
IO.println(d);
}

class Customer
{
private String name;
private int points;
Customer(String name,int points)
{
    this.name=name;
    this.points=points;
}

public String getName()
{
    return name;
}
public int getCreditPoints()
{
return points;
}

public String toString()
{
    return "Customer[Name"+name+" points "+points+"]";
}

}


class CardType
{
private Customer customer;
private String cardType;

CardType(Customer customer,String cardType)
{
this.cardType=cardType;
this.customer=customer;
}

public String toString()
{
    return "Customer[ "+customer.getName()+" is  Elible for "+cardType+"]";
}

}

 class CradsOffer{
     static CardType  getOfferCard(Customer obj)
    {
        int cPoints=obj.getCreditPoints();

if(cPoints<=100&&cPoints>=500)
    {
return new CardType(obj, "Silver");
}else if(cPoints<=501&&cPoints>=1000)
{
return new CardType(obj, "Gold");
}else if(cPoints>1000)
{
    return new CardType(obj, "platinum");
}
    return null;
    }
}