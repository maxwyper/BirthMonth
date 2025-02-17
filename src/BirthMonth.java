import java.util.Scanner;

public class BirthMonth {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // ask user to enter their birth month
        System.out.print("Enter your birth month (1-12): ");
        int birthMonth = scanner.nextInt();

        // Check if the entered month is within range
        if (birthMonth >= 1 && birthMonth <= 12) {
            // Valid month, echo the input
            System.out.println("Your birth month is: " + birthMonth);
        } else {
            // Invalid month, output an error message
            System.out.println("You entered an incorrect month value: " + birthMonth);
        }
    }
}
