import java.util.Random;
import java.util.Scanner;

public class _34_RockPaperGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose From \n 0 For Rock \n 1 For Paper \n 2 For Scissor");
        int userInput = sc.nextInt();
        Random random = new Random();
        int ComputerInput = random.nextInt(3);
        System.out.println("Computer input is: "+ComputerInput);
        if(userInput == ComputerInput)
        {
            System.out.println("Draw");
        }
        else if(userInput == 0 || ComputerInput == 2 && userInput == 1 || ComputerInput == 0 && userInput ==2 || ComputerInput==1){
            System.out.println("You win");
        }
        else
        {
            System.out.println("You Lost");
        }
    }
}
