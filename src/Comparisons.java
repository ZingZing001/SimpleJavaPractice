public class Comparisons {
    public static void main(String [] args){
        int num1 = 3;
        int num2 = 4;
        int num3 = 5;
        System.out.println(max(num1, num2, num3));
    }

    public static int max(int num1, int num2, int num3){
        if (num1 >= num2 && num1 >= num3){
            return num1;
        }
        else if(num2 >= num1 && num2 >= num3){
            return num2;
        }
        else{
            return num3;
        }

    }
}
