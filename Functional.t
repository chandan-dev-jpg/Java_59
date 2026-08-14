
/
1
100%
1.Choose the correct output of the following program
interface Drawable
{
   void draw();
}
public class FunctionalInterface {
	public static void main(String[] args) 
	{
	   () -> System.out.println("Drawing...");	
	}
}

Ans:Drawing
2.What is the output of the following snippet

interface Runnable
{
   void run();
}

public class FunctionalInterfaceExample
{
	public static void main(String[] args) {
		Runnable nit = () -> System.out.println("Thread Started");
		nit.run();
	}
}

ANS:Thread Started
3. What is the output of the following code
interface Course
{
	String courseName();
	String facultyName();
	String duration();
}
@FunctionalInterface
interface NIT extends Course
{
	String nit(String courseName);
}
public class FunctionalInterfaceExample
{
	public static void main(String[] args) {
		NIT nit = (String course) -> course;
		System.out.println(nit.nit("Java"));
	}
}

ANS:Error 
4.What is the output of the following code
@FunctionalInterface
interface NIT 
{
	String nit(String courseName);
}
interface Course extends NIT
{
	String courseName();
	String facultyName();
	String duration();
}
public class FunctionalInterfaceExample
{
	public static void main(String[] args) {
		NIT nit = (String course) -> course;
		System.out.println(nit.nit("Java"));
	}
}
ANS:Java
5.What is the output of the following code
public class FunctionalInterfaceExample
{
  public static void main(String[] args)
  {
    Function<String, Boolean> fun = str -> str.startsWith("A");	
		
		System.out.println(fun.apply("Ankit"));
	}
}

ANS:Error 

6.Which is the correct Compile time error for the following snippet
public class FunctionalInterface 
{
	public static void main(String[] args) 
	{
		String str = (String s) -> s.equals("goolge");
		System.out.println(str);
	}
}

ANS:Error


7.Choose the correct output of the following program
@FunctionalInterface 
interface Str
{
	String str(String str);
}

public class FunctionalInterface {
	public static void main(String[] args) {
		Str nit = s -> "Naresh"+s;
		System.out.println(nit.str("IT"));	
	}
}

ANS:Error
8.Choose the correct output of the following program
interface NIT
{
	public void nit();
}

public class FunctionalInterface 
{
	public static void main(String[] args) 
	{
		String str = "IT";

		NIT n = () -> 
		{
			System.out.println("Naresh" +str);
		};
	}
}

ANS:Nothing print
9.What is the output of the following program
public class Java8
{
	public static void main(String[] args) 
	{
		() -> System.out.println("NareshIT");
	}
}

ANS:A lambda expression cannot exist by itself. Java needs to know the functional interface type of the lambda.

10.What is the output of the following Snippet
interface NIT
{
	public void myInterface(int a);
}

public class Java8 {
	public static void main(String[] args) {
		NIT nit = (a) -> a+1;
	}
}
ANS:Error
11.What is the output of the following Snippet
public class FunctionalInterface {
	public static void main(String args[])
	{
		Function<Integer, Double> div = a -> a / 2.0;
		System.out.println(div.apply(15));
	}
}
ans:error
12 What is the output of the following code

class Student
{ 
    private int id;
    private String name;
    private String gender;
    private int age;
 
    public Student(int id, String name, String gender, int age) 
	{
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
 
    @Override
    public String toString() 
		{
        return "[id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + "]";
        }
}
		
public class FunctionalInterface 
{
	public static void main(String[] args) 
	{
      Supplier<Student> stdSupplier = () -> new Student(1, "Virat", "Male", 24);
		
        Student std =  stdSupplier.get();
        System.out.println(std);       
	}
}

Ans[id=1, name=Virat, gender=Male, age=24]

13.What is the output of the following code
interface NIT
{
	public int myInterface(int a);
}

public class Java8 {
	public static void main(String[] args) {
		NIT nit = (a) -> a+1;
	}
}
ans:nothing print
14.What is the output of the following code
@FunctionalInterface
interface NIT
{
	int cal(int value);
}
public class FunctionalInterfaceExample
{
	public static void main(String[] args) {
		NIT nit = (int value) -> value+25;		
		System.out.println("Result: "+nit.cal(20));
	}
}
ANS:Result: 45
15.What is the output of the following code
@FunctionalInterface
interface NIT
{
	void nit(String name);
}
public class FunctionalInterfaceExample
{
	public static void main(String[] args) {
		NIT nit = (String name) -> "";
		System.out.println(nit.nit("NARESHIT"));
		
	}
}
ANS:Error

16.What is the output of the following code
@FunctionalInterface
interface NIT
{
	String nit(String name);
}
public class FunctionalInterfaceExample
{
	public static void main(String[] args) {
		NIT nit = (String name) -> "Welcome to ";
		System.out.println(nit.nit("NARESHIT"));		
	}
}

ANS:Welcome to 

17.What is the output of the following Snippet
@FunctionalInterface
interface NIT
{
	String str(String nit);
}
public class FunctionalInterfaceExample
{
	public static void main(String[] args) {
	NIT nit = (String nit) -> nit +"";
	}
}

ANS:Error
18.What is the output of the following code
interface NIT
{
	String nit(String name);
}
public class FunctionalInterface
{
	public static void main(String[] args) {
		NIT nit = (String name) -> "Welcome to " + name;
		System.out.println(nit.nit("NARESHIT"));		
	}
}

ANS:Welcome to NARESHIT
19.Simple Functional Interface without using Lambda function
@FunctionalInterface
interface NIT
{
	String nit(String name);
}
public class FunctionalInterfaceExample implements NIT
{
	public static void main(String[] args) {
		FunctionalInterfaceExample nit = new FunctionalInterfaceExample();
		System.out.println(nit.nit("Welcome to "));
	}	
	@Override
	public String nit(String name) {
		return name+"NARESHIT";
	}
}
ANS:Welcome to NARESHIT
20.What is the output of the following code
@FunctionalInterface
interface NIT
{
	String nit(String name);
}
public class FunctionalInterfaceExample
{
	public static void main(String[] args) {
		NIT nit = (String name) -> {
			return name;
		};
		
		NIT nit1 = (String name) -> name;
		
		System.out.println(nit.nit("Welcome to ")+nit1.nit("NARESHIT"));
	}
}



ANS:

Displaying Batch_59_Assignment.txt.