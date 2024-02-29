public class ifNelse {
    public static void main(String [] args){
        boolean isMale = true;
        System.out.println(check(isMale));
        if (check(isMale) == false){
            isMale = false;
            System.out.println(check(isMale));
        }
        
    }
    public static boolean check(boolean isMale){
        
        if(isMale){
            System.out.println("Your are male");
            isMale = false;
            return isMale;
        }

        else{
            System.out.println("OI thats dangerous");
            return isMale;
        }

    }
}
