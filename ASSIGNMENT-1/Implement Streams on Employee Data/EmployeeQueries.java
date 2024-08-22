import java.util.*;
import java.util.stream.Collectors;

public class EmployeeQueries {
    private List<Employee> employees;

    public EmployeeQueries(List<Employee> employees) {
        this.employees = employees;
    }

    public void countByGender() {
        Map<String, Long> genderCount = employees.stream()
            .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println("Number of male and female employees: " + genderCount);
    }

    public void printDepartments() {
        Set<String> departments = employees.stream()
            .map(Employee::getDepartment)
            .collect(Collectors.toSet());
        System.out.println("Departments: " + departments);
    }

    public void averageAgeByGender() {
        Map<String, Double> averageAge = employees.stream()
            .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        System.out.println("Average age of male and female employees: " + averageAge);
    }

    public void highestAndSecondHighestPaid() {
        Optional<Employee> highestPaid = employees.stream()
            .max(Comparator.comparingDouble(Employee::getSalary));

        Optional<Employee> secondHighestPaid = employees.stream()
            .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
            .skip(1)
            .findFirst();

        System.out.println("Highest paid employee: " + highestPaid.orElse(null));
        System.out.println("Second highest paid employee: " + secondHighestPaid.orElse(null));
    }

    public void employeesJoinedAfter2015() {
        List<String> names = employees.stream()
            .filter(e -> e.getJoiningYear() > 2015)
            .map(Employee::getName)
            .collect(Collectors.toList());
        System.out.println("Employees who joined after 2015: " + names);
    }

    public void countEmployeesByDepartment() {
        Map<String, Long> departmentCount = employees.stream()
            .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println("Number of employees in each department: " + departmentCount);
    }

    public void averageSalaryByDepartment() {
        Map<String, Double> averageSalary = employees.stream()
            .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println("Average salary of each department: " + averageSalary);
    }

    public void mostExperiencedEmployee() {
        Optional<Employee> mostExperienced = employees.stream()
            .min(Comparator.comparingInt(Employee::getJoiningYear));
        System.out.println("Employee with most working experience: " + mostExperienced.orElse(null));
    }

    public void youngestMaleInEachDepartment() {
        Map<String, Optional<Employee>> youngestMaleInEachDepartment = employees.stream()
            .filter(e -> "Male".equalsIgnoreCase(e.getGender()))
            .collect(Collectors.groupingBy(
                Employee::getDepartment,
                Collectors.minBy(Comparator.comparingInt(Employee::getAge))
            ));
        System.out.println("Youngest male employee in each department: " + youngestMaleInEachDepartment);
    }

    public void averageAndTotalSalary() {
        double totalSalary = employees.stream()
            .mapToDouble(Employee::getSalary)
            .sum();

        OptionalDouble averageSalary = employees.stream()
            .mapToDouble(Employee::getSalary)
            .average();

        System.out.println("Total salary of the organization: " + totalSalary);
        System.out.println("Average salary of the organization: " + averageSalary.orElse(0));
    }
}
