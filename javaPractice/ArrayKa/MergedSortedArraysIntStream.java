import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Collectors;


public class MergedSortedArraysIntStream {
    public static void main(String[] args) {
        int [] first = {1,2,3,4};
        int [] second= {5,6,7,8};

        System.out.printf("The IntStream sorted array is :%s%n", IntStream.concat(IntStream.of(first),IntStream.of(second))
                                                                           .mapToObj(String::valueOf)
                                                                            .collect(Collectors.joining(" ")));
    }
}