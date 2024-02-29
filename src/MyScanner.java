import java.util.Scanner;

public class MyScanner {
    @SuppressWarnings("resource")
    public static void main(String [] args){
        System.out.println("\n");
        System.out.println("\n");

        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = keyboardInput.nextLine();
        name = name.toUpperCase();
        System.out.println("Hello " + name + "!");
        System.out.print("Enter Your Age: ");
        int age = keyboardInput.nextInt();
        System.out.println("Your age is: " + age + " years old");

        System.out.println("\n");
        System.out.println("\n");
    }
}
