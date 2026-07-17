void main()
{
int ch=Integer.parseInt(IO.readln().trim());
switch (ch) {
    case 1->
    {
        double balance=Double.parseDouble(IO.readln());
        Account a=new Account(balance);
        IO.println(""+a.getBalance());

    }
    case 2->
    {
        double b=Double.parseDouble(IO.readln());
        double r=Double.parseDouble(IO.readln());
        SavingsAccount a=new SavingsAccount(b);
        IO.println(""+a.getBalance());
        IO.println(""+a.calculateInterest(r));

    }
}

}

class Account
{
double balance;
Account(double balance)
{
this.balance=balance;
}

double getBalance()
{
    return balance;
}
}

class SavingsAccount extends Account
{
    SavingsAccount(double balance)
    {
super(balance);
    }


    double calculateInterest(double rate)
    {
        return balance * (rate / 100);
    }
}

