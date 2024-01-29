package Charles26511;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * Name: Christopher Charles
 * CSU ID: 2835983
 * CIS 265: Assignment #11
 * Description: Making a Hashset of BankAccounts
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Set<BankAccount> accounts = new HashSet<BankAccount>();
        File list = new File(args[0]);
        if(args.length!=1)
        {
            System.out.println("Usage: Charles26511.Charles26511 input_file");
            System.exit(1);
        }
        Scanner scan = new Scanner(list);
        while(scan.hasNextLine())
        {
            String test = "";
            test = scan.nextLine();
            String[] split = test.split(",");
            if(split.length==3)
            {
                String owner = split[0];
                int accntnmbr = Integer.parseInt(split[1]);
                double balance = Double.parseDouble(split[2]);
                if(!accounts.add(new BankAccount(owner,accntnmbr,balance)))
                {
                    System.out.println("Account: "+accntnmbr+" already exists");
                }


            }
        }
        for(BankAccount accnt: accounts)
        {
            System.out.println(accnt.toString());
        }
        System.out.println("Bye!");
    }
}