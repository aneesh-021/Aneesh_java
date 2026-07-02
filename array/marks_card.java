package array;
import java.util.Scanner;

public class marks_card {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        
        String[] subjects = {"English", "Maths", "Science", "History", "Geography", "Art", "Music", "PE"};
        int[] marks = new int[subjects.length];
        
        // Loop 1: Taking input using the subject names
        for(int i = 0; i < marks.length; i++) {
            System.out.println("Enter the marks for " + subjects[i] + ": ");
            marks[i] = sc.nextInt();
        }
        
        System.out.println("\n--- Report Card ---");
        
        // We can calculate the total running sum right inside our print loop!
        int totalSum = 0; 
        
        // Loop 2: Printing the marks and adding them up
        for(int i = 0; i < marks.length; i++) {
            System.out.println(subjects[i] + ": " + marks[i]);
            totalSum += marks[i]; // This is short for: totalSum = totalSum + marks[i];
        }
        
        // Dynamic calculations using the loop's totalSum
        double average = (double) totalSum / marks.length;
        double percentage = ((double) totalSum / (marks.length * 100)) * 100;

        System.out.println("-------------------");
        System.out.println("Total Marks: " + totalSum + " / " + (marks.length * 100));
        System.out.println("Average Marks: " + average);
        System.out.println("Percentage: " + percentage + "%");
        
        sc.close(); 
    }
}