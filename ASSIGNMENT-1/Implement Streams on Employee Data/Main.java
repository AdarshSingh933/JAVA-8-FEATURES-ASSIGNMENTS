import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", "Female", 30, 70000, "HR", 2016),
            new Employee("Bob", "Male", 45, 80000, "Finance", 2014),
            new Employee("Charlie", "Male", 35, 60000, "IT", 2018),
            new Employee("Diana", "Female", 28, 65000, "HR", 2019),
            new Employee("Eve", "Female", 50, 90000, "Finance", 2012),
            new Employee("Frank", "Male", 40, 75000, "IT", 2017),
            new Employee("Grace", "Female", 33, 72000, "IT", 2020)
        );

        EmployeeQueries queries = new EmployeeQueries(employees);
        
        queries.countByGender();
        queries.printDepartments();
        queries.averageAgeByGender();
        queries.highestAndSecondHighestPaid();
        queries.employeesJoinedAfter2015();
        queries.countEmployeesByDepartment();
        queries.averageSalaryByDepartment();
        queries.mostExperiencedEmployee();
        queries.youngestMaleInEachDepartment();
        queries.averageAndTotalSalary();
    }
}
