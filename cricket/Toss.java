package cricket;
import java.util.*;
public class Toss{
    public static boolean toss_result(int choice){
        boolean a = false;

        // generating random number between 0 and 1 to choose head and tail
        Random rand = new Random();
        int random_number = rand.nextInt(2);
        System.out.println("\nRandom number is : "+ random_number);
        
        // conditions for checking won or loss of toss
        if(choice == 0){
            if(random_number == 0){
                a = true;
            }
           
        } 
        else{
            if(random_number==1){
                a = true;
            }
        }
        
        return a;
    }    
    
}

