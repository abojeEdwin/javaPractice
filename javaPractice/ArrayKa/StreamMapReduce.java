import java.util.stream.IntStream;

public class StreamMapReduce {
    public static void main(String[] args) {
        System.out.printf("The sum of even int from 2 through 20 is : %d%n", IntStream.rangeClosed(1,10)
                                                                                        .map((int x) ->  x * 2)
                                                                                        .sum());


    }
}