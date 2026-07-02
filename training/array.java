package training;
import java.util.Arrays;

public class array {

    public static void main(String args[]){

        String[] food = {"Pasta", "Biryani", "murg mussalum", "Cake"};
         //System.out.println(food.length);
        //System.out.println(food[1]);
          //System.out.println(food[2]);

          food[2]="Butter Chicken";

          //System.out.println(Arrays.toString(food));
          for (String item : food) {
            System.out.println(item);
          }

    }
    
}
