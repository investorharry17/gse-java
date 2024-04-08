
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);

        System.out.println("Input your name");
        String name = scannerObject.nextLine();
        System.out.println("input your age");
        int age = scannerObject.nextInt();

        System.out.println("Hello " + name + " you are " + age + "years old ");

    }
}

// group 2