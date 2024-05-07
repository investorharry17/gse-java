import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Starting random password genetator...");
        int passwordLength;
        System.out.println("._");
        System.out.println("._");
        System.out.println("._");
        System.out.println("._");
        System.out.println("How many character do you want the passwod to be?");
        passwordLength = myScanner.nextInt();
        makeRandom(passwordLength);

    }

    public static void makeRandom(int length) {
        Scanner myScanner = new Scanner(System.in);

        Random random = new Random();
        String fromString = "qwertyuiopasdfghjklzxcvbnm1234567890QWERTYUIOPASDFGHJKLZXCVBNM./<>!$%^&*()-+#";
        String passwordString = "";
        for (int i = 0; i < length; i++) {

            int randomValue = random.nextInt(fromString.length());
            passwordString = passwordString + fromString.charAt(randomValue);
        }
        System.out.println("Here is your password: " + passwordString);

        System.out.println("._");
        System.out.println("._");
        System.out.println("._");
        System.out.println("._");
        System.out.println("Do you want to genetate another password?");
        System.out.println("(1/2) ... 1 for yes and 2 for no.");
        int reGenerate = myScanner.nextInt();

        if (reGenerate == 1) {

            System.out.println("How many character do you want the passwod to be?");
            int passwordLength = myScanner.nextInt();

            makeRandom(passwordLength);
        } else if (reGenerate == 2) {
            System.out.println("Stopping...");
        } else {

            System.out.println("Selected option was neither 1 or 2.");
            System.out.println("Stopping...");

        }

    }

}

// group 24
