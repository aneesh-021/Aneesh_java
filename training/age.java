package training;
import java.util.Scanner;
public class age{

    public static void main(String args []){

        Scanner sc= new Scanner(System.in);

          System.out.println("Enter the age:  ");
        int age= sc.nextInt();
      

        if(age>=0 && age<=5){

            System.out.println("It is a Baby!!" );
        }
        else if (age>=6 && age<=12) {
 System.out.println("Its a Child!!");

        }

        else if (age>=13 && age<=19){

            System.out.println("Its a teenager");

        }

      else if(age>=20 && age<=50){

        System.out.println("Its a adult!!");
      }

      else{
        System.out.println("Its a old!!");

      }

      sc.close();




        
    }

}

