import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCaseUsingStream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Rashmita", "Abinash", "Brojen", "Maya", "Jyoti", "Banti");
        List<String> upperCase = list.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upperCase);
    }
}
