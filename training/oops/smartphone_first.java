package training.oops;
import java.util.*;

class smartphone_first {//blueprint
    //attribute state
    public boolean isOn;
    public int brightness;
    //behavious functions
    public void turnOn(){
        isOn=true;
        brightness=100;
    }
    public void status(){
        System.out.println(("Brightness status"+ isOn? "ON":"OFF")+"at"+brightness+"%");

    }

    public class oops{
        public static void main(String args[]){
            smartphone_first obj1=new smartphone_first();
            obj1.turnOn();
            obj1.status();

            smartphone_first obj2 = new smartphone_first();
            obj2.turnOn();
            obj2.status();




        }
    }
    
}
