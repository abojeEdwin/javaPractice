import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class ArraysAndStreams {
    public static void main(String[] args) {
            Integer[] values = {4,5,7,8,2,3,9,0,1,6};

            System.out.printf("The original elements in values array is : %s%n", Arrays.asList(values));
            System.out.printf("Display sorted order elements in values array is : %s%n", Arrays.stream(values)
                                                                                                .sorted()
                                                                                                .collect(Collectors.toList()));
            List<Integer> numbersGreaterThan4 =
                    Arrays.stream(values)
                    .filter(x -> x > 4)
                            .sorted()
                            .collect(Collectors.toList());
            System.out.printf("The sorted order values of greater than 4 is : %s%n", numbersGreaterThan4);
    }
}
