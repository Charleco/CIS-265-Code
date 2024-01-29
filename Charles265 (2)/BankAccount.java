package Charles265;

public class BankAccount {
    private String owner;
    private int accntnmbr;
    private double balance;

    public BankAccount(){

    }
    public BankAccount(String owner, int accntnmbr, double balance)
    {
        this.owner = owner;
        this.accntnmbr = accntnmbr;
        this.balance = balance;
    }
    public static void printBankAccount(int i, BankAccount[] array)
    {
        System.out.println("Owner: "+array[i].owner);
        System.out.println("Number: "+array[i].accntnmbr);
        System.out.println("Balance: "+array[i].balance);
    }
    public static int getNumber(int id, BankAccount[] array) {
        for(int i = 0; i < array.length; i++)
        {
            if (array[i].accntnmbr == id)
            {
                id = i;
                return id;
            }
        }
        System.out.println("Account "+ id +" not found.");
        return -2;

    }



}