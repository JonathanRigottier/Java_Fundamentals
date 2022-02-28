package filestream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputStreamExample {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        String test = scanner.nextLine() ;

        FileOutputStream out = new FileOutputStream("Data\\Output.txt", true);

        out.write('\n');
        for(char ch: test.toCharArray()){
            out.write(ch);
        }


    }
}
