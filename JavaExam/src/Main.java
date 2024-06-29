import java.util.Set;
import java.util.TreeSet;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args){
        Employee emp1 = new Employee("Mugisha", "Mike", 20, 3000, "Software Engineer");
        Employee emp2 = new Employee("Mugisha", "Marc", 18, 2000, "Database Administrator");
        Employee emp3 = new Employee("Mugisha", "Mike", 20, 3000, "Software Engineer");
        Employee emp4 = new Employee("Mugisha", "Moses", 20, 3000, "Software Developer");
        Employee emp5 = new Employee("Iradukunda", "Sandra", 20, 3000, "Database Administrator");
        Employee emp6 = new Employee("Iradukunda", "Gael", 20, 3000, "Database Engineer");
        Set<Employee> setAscend = new TreeSet<Employee>();
        setAscend.add(emp1);
        setAscend.add(emp2);
        setAscend.add(emp3);
        setAscend.add(emp4);
        setAscend.add(emp5);
        setAscend.add(emp6);

        for (Employee emp : setAscend){
            System.out.println(emp.getLastName() + " " + emp.getFirstName() + " " + emp.getPosition() + " " + emp.getAge() + " " + emp.getSalary());
        }
    }
}