package filestream.buffering;

import java.io.*;

public class DataBuffering {
    public static void main(String[] args) throws IOException {

        //Option 1
/*        FileReader fileReader = new FileReader("Data\\Input.txt");
        BufferedReader in = new BufferedReader(fileReader);*/

        //Option 2
        BufferedReader in = new BufferedReader(new FileReader("Data\\Input.txt"));

        String line;
        while ((line = in.readLine()) != null){
            System.out.println("Line : " + line);
        }

        //Write
        BufferedWriter out = new BufferedWriter(new FileWriter("Data\\Output2.txt"));

        //Write string line to file
        String data = "This is the data in the output 2 file";
        out.write(data);
        out.close();

    }
}
