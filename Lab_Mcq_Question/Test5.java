class Base
{
   int value=0;
   public Base()
   {
      addValue();
   }
   void addValue()
   {
      value += 10;
   }
   int getValue()
   {
      return value;
   }
}
class Derived extends Base
{
      public Derived()
      {
       addValue();
      }
      void addValue()
      {
        super.addValue();
        value +=  30;
      }
    }
    public class Test5 
    {
      public static void main(String[] args)
      {
          Derived b = new Derived();		  
          IO.println(b.getValue());
      }
    }