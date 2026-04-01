import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n Choose Exception to Test");
            System.out.println("1..Arithmetic Exception (Divide by zero)");
            System.out.println("2..Array Index Out Of Bounds");
            System.out.println("3..Number Format Exception");
            System.out.println("4..Null Pointer Exception");
            System.out.println("5..Input Mismatch Exception");
            System.out.println("6.. Exit");

            try {
                System.out.print("Enter your choice:");
                int choice = input.nextInt();

                switch (choice) {

                    case 1:
                        try {
                            System.out.print("Enter first number: ");
                            int a = input.nextInt();

                            System.out.print("Enter second number: ");
                            int b = input.nextInt();

                            System.out.println("Result: " + (a/b));
                        } catch (ArithmeticException e) {
                            System.out.println("Cannot divide by zero");
                        }
                        break;

                    case 2:
                        try {
                            int[] arr = {1,2,3};
                            System.out.println(arr[5]);
                        }
                        catch (ArrayIndexOutOfBoundsException e) {
                            System.out.println("Array index out of bounds");
                        }
                        break;

                    case 3:
                        try {
                            String str = "abc";
                            int num = Integer.parseInt(str);
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid number format");
                        }
                        break;

                    case 4:
                        try {
                            String text = null;
                            System.out.println(text.length());
                        } catch (NullPointerException e) {
                            System.out.println("Null object used");
                        }
                        break;

                    case 5:
                        try {
                            System.out.print("Enter number: ");
                            int num = input.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("Numbers only");
                            input.next();
                        }
                        break;

                    case 6:
                        System.out.println("Program Ended");
                        input.close();
                        return;

                    default:
                        System.out.println("Invalid choice");
                }

            } catch (InputMismatchException e) {
                System.out.println("Enter numbers only for menu");
                input.next(); //clean
            }
        }
    }
}