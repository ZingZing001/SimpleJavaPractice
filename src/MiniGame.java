import java.util.Scanner;

public class MiniGame {
    public static void main(String [] args){
        @SuppressWarnings("resource")
        Scanner keyboardInput = new Scanner((System.in));

        System.out.print("Enter a color: ");
        String color = keyboardInput.nextLine();
        System.out.print("Enter a pluralNoun: ");
        String pluralNoun = keyboardInput.nextLine();
        System.out.print("Enter a celebrity: ");
        String celebrity = keyboardInput.nextLine();

        System.out.println("Roses are " + color + "\n" + pluralNoun + " are blue \n" + "I love " + celebrity);
    }
}
