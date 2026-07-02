package training;
import java.util.Scanner;

class vowel_count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine().toLowerCase();
        int totalCount;
        int acount = 0, ecount = 0, icount = 0, ocount = 0, ucount = 0;
        for (int i = 0; i<inputString.length();i++){
            char c = inputString.charAt(i);
            switch(c) {
                case 'a':
                    acount++;
                    break;
                case 'e':
                    ecount++;
                    break;
                case 'i':
                    icount++;
                    break;
                case 'o':
                    ocount++;
                    break;
                case 'u':
                    ucount++;
                    break;
                    
            }
            
        }
                
            totalCount = acount + ecount + icount + ocount + ucount;

                 System.out.println("A count: " + acount);
                 System.out.println("E count: " + ecount);
                 System.out.println("I count: " + icount);
                 System.out.println("O count: " + ocount);
                 System.out.println("U count: " + ucount);
                 System.out.println("Total vowels: " + totalCount);
            
        
    
    
    scanner.close();
}


}