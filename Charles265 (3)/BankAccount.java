package Charles265;

import java.util.ArrayList;

public class BankAccount {
    protected String owner;
    protected int accntnmbr;
    protected double balance;


    public BankAccount(){

    }
    public BankAccount(String owner, int accntnmbr, double balance)
    {
        this.owner = owner;
        this.accntnmbr = accntnmbr;
        this.balance = balance;
    }
    public void printBankAccount(int i, ArrayList<BankAccount> list)
    {
        System.out.println("Owner: "+list.get(i).owner);
        System.out.println("Number: "+list.get(i).accntnmbr);
        System.out.println("Balance: "+list.get(i).balance);

    }
    public static int getNumber(int id, ArrayList<BankAccount> list) {
        for(int i = 0; i < list.size(); i++)
        {
            if (list.get(i).accntnmbr == id)
            {
                id = i;
                return id;
            }
        }
        System.out.println("Account "+ id +" not found.");
        return -2;

    }



}