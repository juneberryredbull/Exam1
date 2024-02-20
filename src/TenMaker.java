import java.util.Scanner;

public class TenMaker {
    public static boolean makes10(int numba1, int numba2) {
        int sum = numba1 + numba2;
        if (sum == 10) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first integer: ");
        int first = input.nextInt();
        System.out.println("Enter second integer: ");
        int second = input.nextInt();
        boolean intSum = makes10(first, second);
        if (intSum) {
            System.out.println("They add up to 10.");
        } else {
            System.out.println("They do not add to 10.");
        }

    }
}
