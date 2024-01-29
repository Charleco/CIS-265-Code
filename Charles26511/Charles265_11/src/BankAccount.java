package Charles26511;

public class BankAccount {
    public String owner;
    public int accntnmbr;
    public Double balance;
    public BankAccount()
    {

    }
    public BankAccount(String owner,int accntnmbr,Double balance)
    {
        this.owner = owner;
        this.accntnmbr = accntnmbr;
        this.balance = balance;
    }
    public int getNumber()
    {
        return this.accntnmbr;
    }
    public int hashCode()
    {
        return this.getNumber()%3;
    }
    public boolean equals(Object account1)
    {
        BankAccount accnt2 = (BankAccount) account1;
        if(this.getNumber() == accnt2.getNumber())
        {
            return true;
        }
        else
            return false;
    }
    public String toString()
    {
        return (this.owner+","+this.accntnmbr+","+this.balance);
    }

}
