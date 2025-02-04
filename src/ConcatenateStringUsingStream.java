import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatenateStringUsingStream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Abinash", "loves", "Rashmita");
        String result = list.stream().collect(Collectors.joining(" "));
        System.out.println(result);
    }
}
