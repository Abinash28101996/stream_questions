import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfElementUsingStreamAPI {
    public static void main(String[] args) {
        List<String> list = List.of("Abinash", "Rashmita", "Abinash", "Maya", "Rashmita");
        Map<String, Long> frequencyOfElement = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        for(String str: frequencyOfElement.keySet()){
            System.out.println(str + " : " + frequencyOfElement.get(str));
        }
    }
}
