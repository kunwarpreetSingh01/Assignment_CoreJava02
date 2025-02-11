//WAP using java 8:
// -> Collect all even numbers from a list using stream
// -> Given a list of objects of following class: class Employee{ String fullName; Long salary; String city; }
// Get list of all unique firstNames of employees where their salary is less than 5000 and who live in delhi.
// Note: Full name is concatenation of first name, middle name and last name with single space in between.

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Employee{
    String fullName;
    long Salary;
    String city;

    public Employee(String firstName,String middleName,String lastName,long salary,String city){
        this.fullName = firstName + " " + middleName + " " + lastName;
        this.Salary = salary;
        this.city = city;
    }

    public String getFirstName(){
        return fullName.split(" ")[0];
    }
}
public class fourth {
    public static void main(String[] args) {

        //1.
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        list.stream().filter(e -> e % 2 == 0).forEach(System.out::println);

        //2.
        List<Employee> emps = Arrays.asList(
                new Employee("kunwar", "preet", "singh", 1200, "delhi"),
                new Employee("tan", "preet", "singh", 1400, "delhi"),
                new Employee("jas", "meet", "singh", 6000, "mumbai"),
                new Employee("simran", "preet", "singh", 4000, "jharkhand"),
                new Employee("raju", "singh", "sharma", 3000, "uttrakhand"),
                new Employee("sajy", "singh", "sukha", 2000, "delhi")
        );
        // Given a list of objects of following class: class Employee{ String fullName; Long salary; String city; }
        // Get list of all unique firstNames of employees where their salary is less than 5000 and who live in delhi.
        // Note: Full name is concatenation of first name, middle name and last name with single space in between.

        Set<String> uniqueFirstNames = emps.stream().filter(emp->emp.Salary < 5000 && emp.city == "delhi")
                .map(Employee::getFirstName).collect(Collectors.toSet());

        System.out.println(uniqueFirstNames);

    }
}
