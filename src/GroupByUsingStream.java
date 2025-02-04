import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByUsingStream {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(new Employee("Abinash", 1275000, "IT"),
                new Employee("Rashmita", 200000, "HealthCare"), new Employee("Rashmita", 200000, "IT"));
        Map<String, List<Employee>> groupedByDepartment = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(groupedByDepartment);
    }
}
