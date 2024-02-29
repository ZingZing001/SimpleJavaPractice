import java.util.Scanner;

public class Calculator {
    public static void main(String [] args){
        @SuppressWarnings("resource")
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = keyboardInput.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = keyboardInput.nextDouble();
        System.out.println(num1 + num2);
    }
}
