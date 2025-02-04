import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaximumElementUsingStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(65, 89, 11, 90, 90, 1, 44);
        Optional<Integer> max = list.stream().max(Integer::compareTo);
        //System.out.println(max.get());
        max.ifPresent(System.out::println);
    }
}
