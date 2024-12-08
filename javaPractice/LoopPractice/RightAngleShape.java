import java.util.Scanner;
public class RightAngleShape{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a value : ");
	int number = input.nextInt();

	for(int a = 1 ;a <= number; a++){
		System.out.println(" ");
		for(int j = 1; j <= a; j++){
			System.out.print("* ");
	}
		System.out.println();
}	
		
	
}
}