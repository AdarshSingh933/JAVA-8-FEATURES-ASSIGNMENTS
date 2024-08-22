public class Employee {
    private String name;
    private String gender;
    private int age;
    private double salary;
    private String department;
    private int joiningYear;

    // Constructor
    public Employee(String name, String gender, int age, double salary, String department, int joiningYear) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.salary = salary;
        this.department = department;
        this.joiningYear = joiningYear;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public int getJoiningYear() {
        return joiningYear;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", joiningYear=" + joiningYear +
                '}';
    }
}
