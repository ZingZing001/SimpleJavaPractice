import java.util.Scanner;

public class newGame {
  public static void main(String[] args) {
    Scanner keyboardInput = new Scanner(System.in);

    String secretWord = "giraffe";
    String guess = "";
    int chance = 3;

    while (!guess.equals(secretWord) && chance != 0) {
      chance--;
      System.out.print(
          "Welcome to gussing game, you will have 3 chances to get it right. \nEnter a guess: ");
      guess = keyboardInput.nextLine();
      if (!guess.equals(secretWord) && chance >= 1) {
        System.out.println("Try again? " + chance + " chances remaining");
      }
    }

    if (chance != 0) {
      System.out.println("Your Win");
    } else {
      System.out.println("Your Lose");
    }
  }
}
