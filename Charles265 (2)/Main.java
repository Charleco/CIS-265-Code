package Charles265;
/*
 * Name: Christopher Charles
 * CSU ID: 2835983
 * CIS 265: Assignment #2
 * Description: Bank Account Array Creation
 */
import Charles265.BankAccount;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.print("How many bank accounts do you have(1-10): ");
        int testnmbr = scan.nextInt();
        int nmbr = 0;
        scan.nextLine();
        while(testnmbr<1 || testnmbr>10)
        {
            System.out.print("I cannot create "+testnmbr+" bank accounts!");
            System.out.print("How many bank accounts do you have(1-10): ");
            testnmbr = scan.nextInt();
            scan.nextLine();
        }
        BankAccount[] bankaccounts = new BankAccount[testnmbr];

        for(int i =0; i<testnmbr;i++)
        {
            System.out.print("Bank account "+(i+1) +" owner: ");
            String owner = scan.nextLine();
            System.out.print("Bank account "+(i+1)+" account number:");
            int number = scan.nextInt();
            scan.nextLine();
            System.out.print("Bank account "+(i+1)+" balance:");
            double balance = scan.nextDouble();
            scan.nextLine();
            bankaccounts[i] = new BankAccount(owner,number,balance);


        }
        while (nmbr != -1)
        {
            System.out.print("Enter an account number to search (enter -1 to quit): ");
            nmbr = scan.nextInt();
            scan.nextLine();
            if(nmbr==-1)
                break;
            int arrayval = BankAccount.getNumber(nmbr, bankaccounts);
            if(arrayval ==-2)
                continue;
            BankAccount.printBankAccount(arrayval, bankaccounts);
        }
        System.out.print("Goodbye.");
    }
}

