import java.util.Scanner;

public class BeverageSelector {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose a beverage: \n1. Water\n2. Coke\n3. Coffee");
        int userPick = input.nextInt();
        if (userPick == 1) {
            System.out.println("You have chosen water.");
        } else if (userPick == 2) {
            System.out.println("You have chosen coke.");
        } else {
            System.out.println("You have chosen coffee.");
        }
    }
}
