package Charles265;

import java.util.ArrayList;
import java.io.PrintWriter;
public class CheckingAccount extends BankAccount {
protected int checkLimit;

    public CheckingAccount()
    {

    }
    public CheckingAccount(String owner, int accntnmbr, double balance, int checkLimit)
    {
        super(owner,accntnmbr,balance);
        this.checkLimit = checkLimit;
    }
    public void printBankAccount(PrintWriter pw)
    {
        pw.println(owner+","+accntnmbr+","+balance +",checking"+","+checkLimit);
    }

    public void printBankAccount(int i, ArrayList<BankAccount> list)
    {
        super.printBankAccount(i, list);
        CheckingAccount test = (CheckingAccount) list.get(i);
        System.out.println("Check Limit: "+test.checkLimit);
    }

}
