package Problems;
import java.util.*;

public class sum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum=0;

        for(int i=0; i<=num; i++ ){
            sum=sum+i;

        }
        System.out.println("the sum of the digit are:  "+sum);

    }
}