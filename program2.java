import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter a number (-1 to exit): ");
            int number = scanner.nextInt();
            
            if (number == -1) {
                System.out.println("Exiting the program...");
                break;
            }
            
            if (number % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        }
        
        scanner.close();
    }
}
