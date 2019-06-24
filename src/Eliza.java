import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Eliza {

    private static String input;
    private static Scanner key = new Scanner(System.in);
    private static ArrayList<String> arrString= new ArrayList<>();
    private static Random rand = new Random();



    public static void main(String[]args){
        System.out.println("Hello.  What is your problem today?");
        do {
            input();
            response();
        }
        while(!input.equalsIgnoreCase("q") && !input.equalsIgnoreCase("I am feeling great"));


        }


private static void replace(){
    System.out.print("Why do you think ");
        for(int i =0; i<arrString.size(); i++){

            if(arrString.get(i).equalsIgnoreCase("I")){
                arrString.set(i, "You");
            }
            if(arrString.get(i).equalsIgnoreCase("me")){
                arrString.set(i, "you");
            }
            if(arrString.get(i).equalsIgnoreCase("my")){
                arrString.set(i,"your");
            }
            if(arrString.get(i).equalsIgnoreCase("am")){
                arrString.set(i,"are");
            }
            System.out.print(arrString.get(i)+ " ");
        }
    System.out.println("\n");
}

private static void input(){
    System.out.println("Enter a response, or (Q) to quit");
        arrString.clear();
    input = key.nextLine();
    for(String word: input.split(" ")){
        arrString.add(word);
}
}
private static void response(){
        int response = rand.nextInt(3);
        switch(response){
            case 0:
                System.out.println("Many of my patients tell me the same thing.");
                break;
            case 1:
                System.out.println("Please tell me more.");
            case 2:
                System.out.println("I tis getting late, maybe we had better quit.");
                break;
            default:
                replace();
        }

}
}
