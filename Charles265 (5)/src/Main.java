/*
 * Name: Christopher Charles
 * CSU ID: 2835983
 * CIS 265: Assignment #5
 * Description: Searching for Files Recursively
 */

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        if(args.length!=2)
        {
            System.err.println("Usage: CharlesCIS2655.main path filename");
            return;
        }
            File folder = new File(args[0]);
            String name = args[1];
            Search(folder,name);
    }
    public static void Search(File folder, String name)
    {
        if (folder.isDirectory())
        {
            File[] files = folder.listFiles();
            for(int i = 0; i < files.length; i++)
            {
                Search(files[i], name);
            }
        }
        else
        {
            if(folder.getName().contains(name))
            {
                System.out.println("Found " + folder.getAbsolutePath());
            }
        }
    }
}

