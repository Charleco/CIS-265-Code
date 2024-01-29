import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {

        try {

            File file = new File(args[0]);

            Scanner scan = new Scanner(file);
            Map<String, Integer> wordMap = new TreeMap<>();
            while (scan.hasNextLine()) {
                String test = scan.nextLine();
                String cleantest = test.replaceAll("\\p{P}", "");
                String[] words = cleantest.split("\\s");
                for (String word : words)
                {
                    if (!wordMap.containsKey(word))
                    {
                        wordMap.put(word, 1);
                    }
                    else
                    {
                        int nmbr = wordMap.get(word);
                        ++nmbr;
                        wordMap.put(word, nmbr);
                    }
                }
            }
            wordMap.forEach((k, v) -> {
                System.out.println(k + ": " + v);
            });
        } catch (IOException test) {
            System.err.println("Usage: CharlesCIS265.main input_file");
        }
    }
}