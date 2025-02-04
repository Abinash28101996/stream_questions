import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfAllElementsUsingStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(55, 67, 89, 90, 12, 33);
//        Optional<Integer> result = list.stream().reduce(Integer::sum);
//        System.out.println(result.get());
        int result = list.stream().reduce(0,Integer::sum);
        System.out.println("The result is " + result);
    }
}
