package array;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();
        int numbers[]= new int[size];

        //input
        for(int i=0; i<size; i++){
            numbers[i]= sc.nextInt();

        }
        int x= sc.nextInt();

        for(int i=0; i<size; i++){
            System.out.println("x found at index:  "+i);
        }


    }
}
