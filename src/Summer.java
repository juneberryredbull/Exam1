import java.util.Scanner;

public class Summer {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double userInput = 1;
        double totalSum = 0;
        while (userInput != 0) {
            System.out.print("Enter any number (0 to stop): ");
            userInput = input.nextDouble();
            totalSum += userInput;

        }
        System.out.printf("Total sum: %.2f", totalSum);
    }
}
