import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Collectors;


public class IntStreamOperations {
    public static void main(String[] args) {
        int [] values = {2,4,7,5,6,8,9,3,1,22};

        System.out.println("Displaying the original values");
        System.out.println(
        IntStream.of(values)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" ")));

        System.out.printf("Number of elements in values array is: %d%n", IntStream.of(values).count());
        System.out.printf("Minimum element in values array is : %d%n", IntStream.of(values).min().getAsInt());
        System.out.printf("Maximum element in values array is : %d%n", IntStream.of(values).max().getAsInt());
        System.out.printf("Sorted order of elements in values arrays is : %s%n", IntStream.of(values)
                .sorted()
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" ")));
        System.out.printf("Average element in values array is : %.2f%n", IntStream.of(values).average().getAsDouble());
        System.out.printf("Sum of elements in values array is : %d%n", IntStream.of(values).sum());
        System.out.printf("Using reduce method to display the product %d%n", IntStream.of(values)
                .reduce((x,y) -> x * y).getAsInt());
        System.out.println(IntStream.of(values).summaryStatistics());
    }
}
