import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondLargestElementUsingStreamAPI {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 87, 44, 98, 33);
        Optional<Integer> secondLargestElement = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        secondLargestElement.ifPresent(System.out::println);
    }
}
