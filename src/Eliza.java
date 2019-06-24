import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Eliza {

    private static String input = "";
    private static boolean pig;
    private static String startingCons = "";
    private static Scanner key = new Scanner(System.in);
    public static ArrayList<String> arrString= new ArrayList<>();
    private static Random rand = new Random();



    public static void main(String[]args){
        System.out.println("Hello.  What is your problem today?");
        while (true){

            input();
            if(input.equalsIgnoreCase("pig")){
            }
            if(input.equalsIgnoreCase("q") || input.equalsIgnoreCase("I am feeling great")){
                System.out.println("Great session.  Goodbye until next time!");
                break;
            }
            if(!input.equalsIgnoreCase("pig")){
            response();}
        }


        }


private static void replace(){


        arrString.add(0, "Why"); arrString.add(1, "do");arrString.add(2, "you");arrString.add(3, "think");

    for(int i =4; i<arrString.size(); i++){

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
    }


            if(pig){
                pigLatin();
            }
            else {
                for (int i=0; i<arrString.size(); i++) {
                    System.out.print(arrString.get(i) + " ");
                }
            }
    System.out.println("?\n");
}




private static void input(){


        if(!pig) {
            System.out.println("Enter a response, or (Q) to quit");
        }
        else {
            System.out.println("Entertay atay esponserey, ortay (Q) otay uitqey .");
        }


        arrString.clear();


    input = key.nextLine();

    if(input.equalsIgnoreCase("q") && input.equalsIgnoreCase("I am feeling great")){
        }


    if(input.equalsIgnoreCase("pig")){
        if(pig){
            pig=false;

        }
        pig=true;
        System.out.println("Ellohay. Hatwe istay ourye roblempay odaytay");

    }

    else{
    for(String word: input.split(" ")) {
        arrString.add(word);
    }
}
}
private static void response(){
        int response = rand.nextInt(10);

        switch(response){
            case 0:
                input ="Many of my patients tell me the same thing .";
                break;
            case 1:
                input ="Please tell me more .";
                break;
            case 2:
                input ="I think it is getting late, maybe we had better quit .";
                break;
            default:
                replace();

        }

    if(pig && (response <=2)){
        arrString.clear();
        for(String word: input.split(" ")){
            arrString.add(word);}

        pigLatin();
    }
    else if(response<=2) {
        System.out.println(input);
    }
    }



private static void pigLatin(){
        for (int i =0; i<arrString.size(); i++){
            char[] pigArray = arrString.get(i).toCharArray();
            String piggy = String.valueOf(pigArray[0]);


            if(piggy.equalsIgnoreCase("a") || piggy.equalsIgnoreCase("e") || piggy.equalsIgnoreCase("i") || piggy.equalsIgnoreCase("o") || piggy.equalsIgnoreCase("u")){
                for(char word:pigArray) {
                    System.out.print(pigArray[word]);
                }
                System.out.println("tay");
            }

//PROBLEM HERE LINE 156!!!!!!!!!!
            else{
                startingCons =String.valueOf(pigArray[0]);
            for(int j=0; j<pigArray.length;j++){
                char x =pigArray[j+1];
                pigArray[j] = x;
            }
            for(char word:pigArray) {
                System.out.print(pigArray[word]);
            }

                System.out.println(startingCons);
                arrString.set(i,arrString.get(i) +"ay");

            }
            }

        }
}

