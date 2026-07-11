void main()
{
Car car=new Car(0, null);
IO.println(car);
}

class Enginee
{
    private String type;
    private int horsePower;

    public Enginee(String type,int horsePower)
    {
super();
this.type=type;
this.horsePower=horsePower;
    }

    public String toString()
    {
        return "Engine [ Type="+type+", horsepower="+horsePower+" ]";
    }
}

class Car
{
    private int model;
    private String name;
    private final Enginee engine;
    public Car(int model,String name)
    {
this.name=name;
this.model=model;
this.engine=new Enginee("BMW", 2641);
    }

    public String toString()
    {
        return "Car [Model="+model+", Name="+name+", Engine="+engine+"]";
    }
}

