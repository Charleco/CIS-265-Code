package Charles265;

import java.util.ArrayList;

public class SavingsAccount extends BankAccount{
protected double interest;

    public SavingsAccount()
    {

    }
    public SavingsAccount(String owner, int accntnmbr, double balance, double interest)
    {
        super(owner,accntnmbr,balance);
        this.interest = interest;
    }
    public void printBankAccount(int i, ArrayList<BankAccount> list)
    {
        super.printBankAccount(i, list);
        SavingsAccount test = (SavingsAccount) list.get(i);
        System.out.println("Interest rate:  "+test.interest);
    }

}
