import java.util.Random;
import java.util.Scanner;


public class RandomValue {

   
    public static void main(String[] args) {
        
        Random r= new Random();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any value:");
        int a=s.nextInt();
        int ran=r.nextInt(a);
        System.out.println(ran);
        
    }
    
}
