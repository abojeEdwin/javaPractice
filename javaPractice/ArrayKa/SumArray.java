import java.util.Arrays;
public class SumArray {
    public static void main(String[] args) {
        int array [] = {23,45,76,89,33,22,39,41,37,30,10};
        int sum = 0;
        for (int counter : array) {
            sum += counter;
        }
        System.out.println("The sum of the array is " + sum);
    }
}
