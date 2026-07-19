void main()
{
    int num=Integer.parseInt(IO.readln("Enter Number :"));

    // int IsCode=A.code(num);
         int sum=0;
while(num!=0)
{
    int digit=num%10;
  sum=sum+digit;  
num=num/10;
}

if(sum/num==0)
{
IO.println("It is hasNumber");
}else{
    IO.println("it is not hasNumber");
}
}

