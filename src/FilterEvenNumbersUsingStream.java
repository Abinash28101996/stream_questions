import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumbersUsingStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(33, 76, 43, 90, 100, 41, 41, 99, 998);
        //list.stream().filter(number -> number % 2 == 0).forEach(number -> System.out.println(number));
        List<Integer> evenNumber = list.stream().filter(number ->number % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumber);
    }
}
