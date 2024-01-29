package Charles265_10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
/*
 * Name: Christopher Charles
 * CSU ID: 2835983
 * CIS 265: Assignment #10
 * Description: Making A BST of Songs
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        BST<Song> tree = new BST<>();
        File songList =new File(args[0]);
        int songcnt = 0;
        if(args.length!=1)
        {
            System.out.println("Input the program argument for song list");
            System.exit(-1);
        }
        Scanner scan = new Scanner(songList);
        scan.nextLine();
        String test = "";
        while(scan.hasNextLine())
        {
            test = scan.nextLine();
            String[] split = test.split("\t");
            if(split.length==4)
            {
                String artist = split[0];
                String title = split[1];
                String link = split[2];
                StringBuilder text = new StringBuilder();
                String line = "";
                while(scan.hasNextLine())
                {
                    line = scan.nextLine();
                    if(line.equals("\""))
                    {
                        break;
                    }
                    else
                    {
                        text.append(line+"\n");
                    }
                }
                Song newSong = new Song(artist,title,link, text.toString());
                tree.insert(newSong);
                songcnt++;
            }

        }

        scan.close();
        Scanner scan2 = new Scanner(System.in);
        System.out.println( songcnt+" songs. " + tree.size+" unique titles.");
        String user = "";
        while(1==1)
        {
            System.out.println("Please input the title of the song (Quit to exit): ");
            user = scan2.nextLine();
            Song testSong = tree.find(new Song("", user, "", ""));
            if(user.equals("Quit"))
            {
                System.out.println("Bye!");
                System.exit(0);
            }
            else if(testSong==null)
            {
                System.out.println("title "+user+" not found");
            }
            else
            {
                System.out.println(testSong);
            }
        }
    }
}