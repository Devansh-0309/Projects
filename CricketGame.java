import instructions_display.*;
import cricket.*;
import batBowl.Selection;

import java.util.*;

public class CricketGame {
    public static void main(String[] args) {
        
        // Calling show_instructions function with class Instruction
        Instruction.show_instruction();
        
        Scanner scn = new Scanner(System.in);
        
        // Taking toss input from user for heads or tails
        int a = 1, choice = 0;
        boolean result = false; 

        while (a == 1) {
            System.out.print("\nEnter '0' for Heads or '1' for Tails : ");
            choice = scn.nextInt();
            if (choice == 0 || choice == 1) {
                a--;
                
                // Calling toss_result function with class Toss
                result = Toss.toss_result(choice);
            } else {
                System.out.println("Invalid Input!");
            }
        }
                
        // Use the result variable outside the loop
        if (result) {
            System.out.println("\n\n\t\t\t\t    You won the toss!");
            System.out.println("\n\nSelect accordingly if you want to : ");
            System.out.println("0. Bat");
            System.out.println("1. Bowl");
            int y = 1;
            while(y == 1){
                System.out.print("\nEnter '0' for BATTING and '1' for BOWLING : ");
                int batbowl = scn.nextInt();
                if(batbowl == 0 || batbowl == 1){
                    y--;
                    if(batbowl == 0){
                        System.out.println("\nYou have elected to bat first.");
                        int total = Selection.score(batbowl);
                        System.out.println("\nYour Total score is : "+total);
                        System.out.println("\n\t\t\t\t   CPU need to score "+(total+1) + " to win");
                        batbowl = 1;
                        int total1 = Selection.score(batbowl);
                        System.out.println("\nCPU Total score is : "+total1);
                        if(total > total1){
                            int diff = total - total1;
                            System.out.println("\n\n\t\t\t\t    You won the game by "+diff+ " runs");
                        }
                        else{
                            int diff = total1 - total;
                            System.out.println("\n\n\t\t\t\t    You lost the game by "+diff+" runs");
                        }

                    }
                    else{
                        System.out.println("\nYou have elected to bowl first.");
                        int total = Selection.score(batbowl);
                        System.out.println("\nCPU Total score is : "+total);
                        System.out.println("\n\t\t\t\t    You need to score "+(total+1) + " to win");
                        batbowl = 0;
                        int total1 = Selection.score(batbowl);
                        System.out.println("\nYour Total score is : "+total1);
                        if(total > total1){
                            int diff = total - total1;
                            System.out.println("\n\n\t\t\t\t    You Lost the game by "+ diff+" runs");

                        }
                        else{
                            int diff = total1 - total;
                            System.out.println("\n\n\t\t\t\t    You Won the game by "+diff+" runs");
    
                        }
                    }
                    
                }
                else{
                    System.out.println("\nInvalid Input!");
                }
            }

            
        }
        else{
            System.out.println("\n\n\t\t\t\t    You lost the toss!");
            Random rand = new Random();
            int cpu_choice = rand.nextInt(2);
            if(cpu_choice == 0){
                cpu_choice = 1;
                System.out.println("\nCPU has elected to bat first");
                int total = Selection.score(cpu_choice);
                System.out.println("\nCPU total score is : "+total);
                System.out.println("\n\t\t\t\\t    You need to score "+(total+1) + " to win");
                cpu_choice = 0;
                int total1 = Selection.score(cpu_choice);
                System.out.println("\nYour Total score is : "+total1);
                if(total > total1){
                    int diff = total - total1;
                    System.out.println("\n\n\t\t\t\t    You Lost the game by "+diff+" runs");
                }
                else{
                    int diff = total1 - total;
                    System.out.println("\n\n\t\t\t\t    You won the game by "+diff+" runs");
                }


            } 
            else{
                System.out.println("CPU has elected to bowl first.");
                cpu_choice=0;
                int total = Selection.score(cpu_choice);
                System.out.println("\nYour total score is : "+total);
                System.out.println("\n\t\t\t\t   CPU need to score "+(total+1) + " to win");
                cpu_choice = 1;
                int total1 = Selection.score(cpu_choice);
                System.out.println("\nCPU Total score is : "+total1);
                if(total > total1){
                    int diff = total - total1;
                    System.out.println("\n\n\t\t\t\t    You won the game by "+diff+ " runs");
                }
                else{
                    int diff = total1 - total;
                    System.out.println("\n\n\t\t\t\t    You lost the game by "+diff+" runs");
                }
            }

        }
    scn.close();
    }
}