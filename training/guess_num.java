package training; 
import java.util.Random;
import java.util.Scanner;


public class guess_num {
    public static void main(String[] args) {
        
        Random randobj= new Random();
        Scanner sc = new Scanner(System.in);

        int Numtoguess= randobj.nextInt(100)+1;// +1 to shift the array from 0 to 99 to 100
        int nooftries=0;
        int guess;
        boolean hasGuessCorrectly=false;


        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100");

        while(!hasGuessCorrectly){
            System.out.println("Enter the number between 1 to 100: ");
            guess= sc.nextInt();
             nooftries++;
            
           

            if(guess>Numtoguess){
                System.out.println("Number is too high!!!");

            }

            else if(guess<Numtoguess){
                System.out.println("Number is Low!!");
            }

            else{
                System.out.println("you have guess the correct number:  "+Numtoguess);
                System.out.println("The no of attempts needed:  "+nooftries);
                break;
            }
           
            
        }



    }
}
