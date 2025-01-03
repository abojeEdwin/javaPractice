import java.util.stream.IntStream;

public class StreamFilterReduce {
    public static void main(String[] args) {
        System.out.printf("The sum of the tripled even numbers from 2 through 10 is : %d%n", IntStream.rangeClosed(1, 10)
                                                                                          .filter(X-> X % 2 == 0)
                                                                                           .map(x -> x * 3)
                                                                                            .sum());
    }
}
