import java.util.Scanner;
import java.util.Random;

public class Bowling {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int turn = 1;  //keeps track of the turn (frame) number
    int finScore = 0;

    System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("L E T ' S   B O W L L L L L");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~");

    Random rand = new Random();


    	for (int i = 1; i < 10; i++){



           System.out.println("Round " + turn + " , NOW STARTING");

    		int s1 = rand.nextInt(11);
          if (s1 == 10){
            System.out.println("You got a strike!! Woohoo! ");
          } else if (s1 == 5) {
            System.out.println("You got a spare!");
          } else if (s1 == 0){
            System.out.println("Oh no! You missed all the pins..");
          } else{
    		System.out.println("Your score for the first bowl was: " + s1 );
          }
           finScore += s1;  //keeping track of score

    		int s2 = rand.nextInt(11);
           if (s2 == 10){
            System.out.println("You got a strike!! Woohoo! ");
          } else if (s2 == 5) {
            System.out.println("You got a spare!");
          } else if (s2 == 0){
            System.out.println("Oh no! You missed all the pins..");
          } else{
    		System.out.println("Your score for the first bowl was: " + s2 );
          }


      		turn ++;

          finScore += s2;


        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

          if (turn == 10){
            System.out.println("Round 10 Start!");

            int s3 = rand.nextInt(11);
            int s7 = rand.nextInt(11);

            if (s3 == 5 | s7 == 5){

              finScore += 5;
              System.out.println("Lucky you, you get a bonus bowl!");
              int s4 = rand.nextInt(11);
              System.out.println("You bowled a : " + s4 );

              finScore += s4;

              System.out.println("Your final score is: " + finScore);

            }else if (s3 == 10 | s7 == 10){

              finScore += 10;
                System.out.println("Wow, you get two bonus bowls!");
                int s6 = rand.nextInt(11);
            	int s8 = rand.nextInt(11);

              	finScore += s6;
              	finScore += s8;
              	System.out.println("Your final score is: " + finScore);

            }else{

              System.out.println("Your final score is: " + finScore);

            }

  }
}
  }
}
