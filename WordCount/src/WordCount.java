import java.util.Scanner;
import java.io.File;

public class WordCount {
    public static void main(String[] args) throws Exception{
        File file = new File("pg50133.txt");
        Scanner scanner = new Scanner(file);

        Integer words = 0;
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            // To count the number of words in that line
            // we'll want to split it on the spaces
            words += line.split(" ").length;
        }

        System.out.println("The file contains: " + words + " words.");
    }
}
