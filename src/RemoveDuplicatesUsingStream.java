import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesUsingStream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Abinash", "Rashmita", "Abinash", "Maya", "Rashmita", "Maya");
        List<String> finalList = list.stream().distinct().collect(Collectors.toList());
        System.out.println(finalList);
    }
}
