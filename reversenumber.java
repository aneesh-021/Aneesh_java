import java.util.*;
public class reversenumber {
    

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int num = sc.nextInt();
        int original=num;

     int reverse = 0;
     while (num>0){
        int digit = num%10;
         reverse= reverse*10+ digit;
        num=num/10;
        
     }
     if(original==reverse){
     System.out.println(+original+ "is palindrome");
     }
     else{
        System.out.println(+original+ "is not a palindrome");
     }
        
        
    }
    
}

    

