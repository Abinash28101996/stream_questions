import java.util.Arrays;
import java.util.List;

public class SortListUsingLamdaExpression {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Rashmita", "Maya", "Brojen", "Abinash");
        list.sort((s1, s2) -> s1.compareTo(s2));
        System.out.println(list);
    }
}
