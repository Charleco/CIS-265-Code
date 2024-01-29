package Charles265;
/*
 * Name: Christopher Charles
 * CSU ID: 2835983
 * CIS 265: Assignment #3
 * Description: Checking/Savings Account Arraylist Creation
 */
import Charles265.BankAccount;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        ArrayList<BankAccount> bankaccounts = new ArrayList<BankAccount>();
        int testint;
        int count = 1;
        int nmbr = 0;
        BankAccount test;
        String type;
        while (1 == 1)
        {
            System.out.print("Do you want to create more accounts (Y or N): ");
            String teststring = scan.nextLine();

            if (teststring.equals("N"))
            {
                break;
            }
            else
            {
                System.out.print("Is account " + count + " a checking account or a savings account? (C or S): ");
                type = scan.nextLine();
                System.out.print("Bank account " + (count) + " owner: ");
                String owner = scan.nextLine();
                System.out.print("Bank account " + (count) + " account number:");
                int number = scan.nextInt();
                scan.nextLine();
                System.out.print("Bank account " + (count) + " balance:");
                double balance = scan.nextDouble();
                scan.nextLine();
                if (type.equals("C"))
                {
                    System.out.print("Bank account " + count + " check limit: ");
                    int checklimit = scan.nextInt();
                    scan.nextLine();
                    bankaccounts.add(new CheckingAccount(owner, number, balance, checklimit));
                }
                else
                {
                    System.out.print("Bank account " + count + " interest rate: ");
                    double interestRate = scan.nextDouble();
                    scan.nextLine();
                    bankaccounts.add(new SavingsAccount(owner, number, balance, interestRate));
                }

            }
        }
            while (nmbr != -1) {
                System.out.print("Enter an account number to search (enter -1 to quit): ");
                nmbr = scan.nextInt();
                scan.nextLine();
                if (nmbr == -1)
                    break;

                int arrayval = BankAccount.getNumber(nmbr, bankaccounts);
                if (arrayval == -2)
                    continue;
                if(bankaccounts.get(arrayval) instanceof CheckingAccount)
                {
                    test = new CheckingAccount();
                }
                else
                {
                    test = new SavingsAccount();
                }
                test.printBankAccount(arrayval, bankaccounts);
            }
            System.out.print("Goodbye.");
        }
    }

