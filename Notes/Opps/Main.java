void main()
{

    Restaurant b=new Restaurant();

    b.isOpen=Boolean.parseBoolean(IO.readln());
    b.deliversToUser=Boolean.parseBoolean(IO.readln());
    b.userDistance=Integer.parseInt(IO.readln());
    IO.println(b.isAvailabe());

}


class Restaurant
{
    boolean isOpen;
    boolean deliversToUser;
    int userDistance;

    String isAvailabe()
    {
        if(isOpen && deliversToUser && userDistance<=8)
        {
            return "Available";
        }
        else
        {
            return "Not Available";
        }
    }
}