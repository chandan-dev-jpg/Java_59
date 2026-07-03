void main()
{
    int size=Integer.parseInt(IO.readln("Enter Array of Size : "));
int arr[]=new int[size];
    for(int i=0;i<size;i++)
    {
        arr[i]=Integer.parseInt(IO.readln());
IO.println("Enter Element "+arr[i]);
    }
    
    int Sum=findsum.get(arr);
    IO.println("Sum of all element value is "+Sum);
    int avg=Sum/size;
    IO.println(avg);
}

class findsum
{
    public static int get(int []arr)
    {
int sum=0;

int avg=0;
for(int element:arr)
        {
sum=element+sum;

    }
    return sum;

}
}