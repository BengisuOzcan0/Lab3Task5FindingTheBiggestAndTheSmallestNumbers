import java.util.*;
public class Main {
    public static void main(String[] args) {

        int min = 100;
        int max = 0;
        int numberOfIntegers = 10;

        Random r=new Random();


        int k = 0 ;
        while(k < numberOfIntegers){
            int number =r.nextInt(100);
            if(number > max){
                max = number;
            }
            if(number < min ){
                min = number;
            }
            k++;
            System.out.println("Random number:" + number);
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}