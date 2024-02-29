public class myFunctions {
  public static void main(String[] args) {
    String name = "ZingZing";
    int age = 13;
    System.out.println("Top");
    sayHi(name, age);
    sayHi("Desmond", 18);
    System.out.println("Bottom");
  }

  public static void sayHi(String name, int age) {
    System.out.println("\n");

    System.out.println("Wagon " + name + " !");
    System.out.println("Your " + age + " !");

    System.out.println("\n");
  }
}
