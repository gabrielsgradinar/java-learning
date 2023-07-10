import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CompileTimeExample {

    public static void main(String[] args) {
        try {
            readFile("grettings.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Process Complete");
        }

    }

    public static void readFile(String fileName) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Scanner scanner = new Scanner(fis);
        System.out.println(scanner.nextLine());
        scanner.close();
    }
}