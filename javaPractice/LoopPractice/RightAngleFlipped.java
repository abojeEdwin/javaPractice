import java.util.Scanner;
public class RightAngleFlipped{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

	System.out.print("Enter a value :");
	int number = input.nextInt();

	for(int a = 1; a <= number ; a++){
		System.out.println("");
		for(int b = a; b <= number; b++){
			System.out.print(" * ");
		}
		System.out.println();
}



}
}