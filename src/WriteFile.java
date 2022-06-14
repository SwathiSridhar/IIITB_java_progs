import java.util.Scanner;
import java.io.FileWriter;

public class WriteFile {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        try {

            FileWriter writer = new FileWriter("C:\\Personal\\IIIT-B\\Java progs\\Proj1\\text_files\\test.txt"); // Specify the path of the file where you wish to store the output of this code
            Boolean write = true;

            System.out.print("Enter what you wish to write ");
            String line = scan.nextLine(); // read the line

            // write the input line to the file.
            writer.write(line);
            writer.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Done");
    }

}
