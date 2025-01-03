import java.security.SecureRandom;
import java.util.stream.Collectors;

public class Randomintegers {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();
        System.out.println("Random numbers on seperate lines");
        randomNumbers.ints(10,1,10)
                .forEach(System.out::println);
        String numbers =
                randomNumbers.ints(10,1,10)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(" "));
        System.out.printf("Random numbers on a single line is : %s%n", numbers);

    }
}
