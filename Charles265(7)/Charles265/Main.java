package Charles265;
/*
 * Name: Christopher Charles
 * CSU ID: 2835983
 * CIS 265: Assignment #7
 * Description: Checking/Savings Account Comparison
 */
import Charles265.BankAccount;

import java.util.*;
import java.io.PrintWriter;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
        BufferedReader br = new BufferedReader(new FileReader(args[0]));
        PrintWriter pw = new PrintWriter(args[1]);
        ArrayList<BankAccount> bankaccounts = new ArrayList<BankAccount>();
        String line;
        BankAccount test;
        while((line = br.readLine())!= null)
        {
            String account[]= line.split(",");
            String owner = account[0];
            int number = Integer.parseInt(account[1]);
            double balance = Double.parseDouble(account[2]);
            String type = account[3];
            if(type == "C")
            {
                int checklimit = Integer.parseInt(account[4]);
                test = new CheckingAccount(owner,number,balance,checklimit);
                bankaccounts.add(test);
            }
            else
            {
                double interestRate = Double.parseDouble(account[4]);
                test = new SavingsAccount(owner,number,balance,interestRate);
                bankaccounts.add(test);
            }

        }
        for(int i =bankaccounts.size()-1; i>=0; i--)
        {
            AccountNumberComparator ancomp = new AccountNumberComparator();
            Collections.sort(bankaccounts, ancomp);
            (bankaccounts.get(i)).printBankAccount(pw);
        }
        pw.close();
        System.out.print("Bye!");
        }
        catch (IOException e) {
            System.err.println("Usage: CharlesCIS265.main input_file output_file");
        }
        }
    }

