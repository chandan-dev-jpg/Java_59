void main()
{
Lion lion[]={new Lion("A"),new Lion("B")};
healthCheckupCamp(lion);


}

void healthCheckupCamp(Animal ...animals)
{
for(Animal animal:animals)
{
    animal.healthCheckup();
}
}

abstract class Animal
{

    protected String name;

    public Animal(String name)
    {
this.name=name;
    }

    public abstract void healthCheckup();
}

class Lion extends Animal
{
    public Lion(String name)
    {
        super(name);

    }

    public void healthCheckup()
    {
        IO.println(name+" is goig for health CheckUp");
    }
}

class Bird extends Animal
{
    public Bird(String name)
    {
        super(name);

    }

    public void healthCheckup()
    {
        IO.println(name+" is goig for health CheckUp");
    }
}

class Dog extends Animal
{
    public Dog(String name)
    {
        super(name);

    }

    public void healthCheckup()
    {
        IO.println(name+" is goig for health CheckUp");
    }
}