package array;
public class first_code {

    public static void main(String args[]){
        int marks[]= new int[5];
        marks[0]=85; // marks of eng
        marks[1]=90; // marks of maths  
        marks[2]=95; // marks of chemistry
        marks[4]= 100; // marks of physics

        // or we could directly write the value in the array like this
        //int marks[]= {85,90,95,0,100};

        //System.out.println(marks[0]); // it will print 85
        //System.out.println(marks[1]); // it will print 90
        //System.out.println(marks[2]); // it will print 95
        //System.out.println(marks[4]); // it will print 100

        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
    }

}
