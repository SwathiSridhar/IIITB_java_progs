import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Numbers2 {
    public static void main(String args[]) throws FileNotFoundException {

        File inputfile = new File("C:\\Personal\\IIIT-B\\Java progs\\Proj1\\text_files\\Numbers2.txt"); // Specify the path of the file

        Scanner scan = new Scanner(inputfile);
        int numb = 0;
        double sum = 0;

        while (scan.hasNext()) {  // read the numbers and add them to the value of the sum
            int number = scan.nextInt();
            sum = sum + (double)number;
            numb=numb+1;
        }

        System.out.println("Average is : " + sum/(double)numb);
    }
}

