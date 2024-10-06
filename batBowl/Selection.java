package batBowl;
import java.util.*;
public class Selection {
    public static int score(int choice2){
        int cpu_total_score = 0;
        int user_total_score = 0;
        Random obj = new Random();
        boolean ans = true;
        switch (choice2) {
            case 0:
            while(ans){
                boolean user_input_check = true;
                int cpu = obj.nextInt(6)+1;
                Scanner run = new Scanner(System.in);
                while(user_input_check){
                    System.out.print("\nHow much runs you want to score between 1-6 : ");    
                    int user_score = run.nextInt();

                    if(user_score > 0 && user_score < 7){
                        user_input_check = false;
                        if(cpu != user_score){
                            user_total_score += user_score; 
                            System.out.println("\nThe CPU picked up : "+cpu);
                            System.out.print("Your score is : "+user_total_score);
                        }
                        else{
                            ans = false;
                            return user_total_score;
                        }
                    }
                    else{
                        System.out.println("\n\nInvalid Input!");
                    }

                }   
            } 
                break;
            case 1:
            while(ans){
                boolean user_input_check = true;
                int cpu = obj.nextInt(6)+1;
                Scanner run = new Scanner(System.in);
                while(user_input_check){
                    System.out.print("\n\nPredict the run of cpu between 1-6 : ");    
                    int user_score = run.nextInt();
                    if(user_score > 0 && user_score < 7){
                        user_input_check = false;
                        if(cpu != user_score){
                            cpu_total_score += cpu; 
                            System.out.println("\nCPU picked up : "+cpu);
                            System.out.print("CPU total score is : "+cpu_total_score);
                        }
                        else{
                            ans = false;
                            return cpu_total_score;
                        }
                    }
                    else{
                        System.out.println("\n\nInvalid Input!");
                    }
                }
            }
            break;
        }
        return 0;
    }
}
