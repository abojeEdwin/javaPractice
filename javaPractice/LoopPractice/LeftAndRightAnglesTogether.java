import java.util.*;
public class LeftAndRightAnglesTogether{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

	System.out.println("Enter a value :");
	int number = input.nextInt();

	for(int a = 1; a <= number; a++){
		for(int b = 1; b <= number - a; b++){
			System.out.print(" ");
		}
			for(int c = 1 ; c <= a; c++){
				System.out.print("*");
				}
					for(int f = 1; f <= number - a; f++){
						System.out.print(" ");
				}
					for(int g = 1; g <= a ; g++){
						System.out.print("*");
				}
				System.out.println();
				}
		

}
}