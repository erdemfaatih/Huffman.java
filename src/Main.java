import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {


        File file = new File("C:\\Users\\casper\\Desktop/letter.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line =bufferedReader.readLine())!= null){

            Huffman huffman = new Huffman();
            huffman.
        }


    }
}