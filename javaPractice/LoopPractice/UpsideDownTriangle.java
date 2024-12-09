import java.util.Scanner;
public class UpsideDownTriangle{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

	System.out.println("Enter a value :");
	int number = input.nextInt();

	for(int a =  0; a <= number; a++){
		for(int b = 0; b <= a; b++){
			System.out.print(" ");
			}
			for(int c = a; c < number; c++){
				System.out.print( "*" );
			}
				for(int d = a; d <= number; d++){
					System.out.print( "*" );
			}
				System.out.println();
			}		
	


}
}