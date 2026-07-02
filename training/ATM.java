package training;
import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount to withdraw: ");
        int amount = scanner.nextInt();

        
        if (amount <= 0 || amount % 50 != 0) {
            System.out.println("Invalid amount. Must be a multiple of 100.");
        } else {
            System.out.println("valid amount, The notes are as following:");

            
            if (amount >= 2000) {
                int count2000 = amount / 2000;
                amount = amount % 2000;
                System.out.println("2000 x " + count2000);
            }
            if (amount >= 500) {
                int count500 = amount / 500;
                amount = amount % 500;
                System.out.println("500 x " + count500);
            }
            if (amount >= 200) {
                int count200 = amount / 200;
                amount = amount % 200;
                System.out.println("200 x " + count200);
            }
            if (amount >= 100) {
                int count100 = amount / 100;
                amount = amount % 100;
                System.out.println("100 x " + count100);
            }
             if (amount >= 50) {
                int count50 = amount / 50;
                amount = amount % 50;
                System.out.println("50 x " + count50);
        }
      
    }
}
}