import java.util.stream.IntStream;


public class StreamReduce {
    public static void main(String[] args) {
        System.out.printf("The sum of 1 through 10 is: %d%n", IntStream.rangeClosed(1, 10)
                                                                       .sum());
    }
}
