import java.util.Random;
import java.util.Scanner;

public class randomNumber {
    public static void main(String[] args) {
        Random randomNum = new Random();
        Scanner input = new Scanner(System.in);

        int guessedNumber = randomNum.nextInt(10);
        int guessNum = input.nextInt();
        while (guessNum == guessedNumber) {
            guessedNumber = randomNum.nextInt(10);
            System.out.print("Enter a number between 1 and 10: ");
            if(guessNum == guessedNumber){
                    System.out.println("Congratulations! You guessed it!");
            }else{
                System.out.println("Incorrect input, try again");
            }
        }
    }
}
