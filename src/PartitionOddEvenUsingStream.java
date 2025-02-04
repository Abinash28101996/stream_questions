import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionOddEvenUsingStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(87, 99, 30, 45, 10, 8, 14);
        Map<Boolean, List<Integer>> partionedNumber = list.stream().collect(Collectors.partitioningBy(number -> number % 2 == 0));
        System.out.println(partionedNumber);
    }
}
