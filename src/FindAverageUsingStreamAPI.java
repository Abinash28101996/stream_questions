import java.util.List;

public class FindAverageUsingStreamAPI {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        double ans = list.stream().mapToInt(Integer::intValue).average().orElse(0);
        System.out.println(ans);
    }
}
