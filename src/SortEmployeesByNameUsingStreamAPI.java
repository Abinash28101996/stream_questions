import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmployeesByNameUsingStreamAPI {
    public static void main(String[] args) {
        List<Employee> list = List.of(new Employee("Rashmita", 2000000, "Health Care"),
                new Employee("Zeeshan", 1000000, "HR"), new Employee("Abinash", 6000000, "Java Developer"));
        List<Employee> sortedList = list.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
        for(Employee employee: sortedList){
            System.out.println(employee.getName());
        }
    }
}
