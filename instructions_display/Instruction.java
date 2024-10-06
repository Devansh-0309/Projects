package instructions_display;
import java.util.Scanner;
public class Instruction{
    public static void show_instruction(){
        Scanner scn = new Scanner(System.in);
        System.out.print("\nEnter Your Name : ");
        String name = scn.nextLine();
        System.out.println("\n\n\t\t\t\t\t      Welcome "+ name + "!");
        System.out.println("\n\nThis is a online CRICKET game. Below are all the instructions provided to help you play.\n");
        System.out.println("1. First you will be given choices of HEADS or TAILS and you have to choose one.");
        System.out.println("2. If you win the toss , then you will have the power to choose to BAT or BOWL first.");
        System.out.println("3. There will be six choices to score runs that will be in the form of numbers from 1-6.");
        System.out.println("4. There are unlimited balls and only a single wicket. The CPU will generate random number every time between 1-6.");
        System.out.println("5. The moment your input matches the random number then you will be given out and your total score will be displayed.");
        System.out.println("6. The one with the highest score will win.");
    }   
}
