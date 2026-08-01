void main()
{
Maneger m1=new Maneger(100,"Scott");
Maneger m2=new Maneger(101,"Raju");
m1.equals(m2);
}

class Maneger
{
    private int id;
    private String name;
    public Maneger(int id,String name)
    {
        this.name=name;
        this.id=id;
    }

    @Override
    public boolean equals(Object obj)
    {

    }
}