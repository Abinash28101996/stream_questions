import java.util.List;
import java.util.stream.Collectors;

public class FlattenListOfListsUsingStreamAPI {
    public static void main(String[] args) {
        List<List<Integer>> list = List.of(List.of(1, 3, 5), List.of(7, 8, 9), List.of(10, 11, 12));
        List<Integer> flattenList = list.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println(flattenList);
    }
}
