import java.util.Scanner;

public class Eliza {
    public static void main(String[]args){
        Scanner key = new Scanner(System.in);
        String input ="x";
        while(!input.equalsIgnoreCase("q") && !input.equalsIgnoreCase("I am feeling great")){
            input = key.nextLine();
            System.out.println(input);

        }

    }

}
