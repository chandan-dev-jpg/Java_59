void main()
{
int number=Integer.parseInt(IO.readln());
for(int i=1;i<=number;i++)
{
int id1=Integer.parseInt(IO.readln().trim());
String name1=IO.readln();
int id2=Integer.parseInt(IO.readln().trim());
String name2=IO.readln();
Passenger.totalPassengers++;
IO.println("--- Passenger"+i+"Details ---");
Passenger p=new Passenger(id1,name1);
Passenger p2=new Passenger(id2,name2);
p.display();
p2.display();
}
}

class Passenger
{
    static int totalPassengers=0;
    int PassengerId;
    String PassengerName;
    public Passenger(int PassengerId,String PassengerName)
    {
        this.PassengerId=PassengerId;
        this.PassengerName=PassengerName;

    }

public void display()
{
    // IO.println("");
    IO.println("Passenger ID: "+PassengerId);
    IO.println("Passenger Name: "+PassengerName);
    IO.println("Passenger Name: "+totalPassengers);
}

}