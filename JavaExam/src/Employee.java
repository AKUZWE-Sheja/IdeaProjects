/**
 * rw.ac.rca.collection the group of classes on collection
 */

import java.awt.font.TextHitInfo;
import java.util.Objects;

/**
 * The student class with CompareTo has details method to facilitate sorting , hashcode , equals overriden from objects
 * * The student  has details information about names and identification
 * @author akuzwe
 */

public class Employee implements Comparable{
    private String lastName;
    private String firstName;
    private String position;

    private Integer age;
    private Integer salary;


    /**
     * Default constructor
     */
    public Employee() {
        super();
    }

    public Employee(String lastName, String firstName, Integer age, Integer salary, String position) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.position = position;
        this.age = age;
        this.salary = salary;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && salary == employee.salary && Objects.equals(lastName, employee.lastName) && Objects.equals(firstName, employee.firstName) && Objects.equals(position, employee.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName, position, age, salary);
    }

    @Override
    public int compareTo(Object o) {
        Employee empl = (Employee) o;
        if (this.lastName.compareTo(empl.lastName) != 0)
            return this.lastName.compareTo(empl.lastName);
        if (this.firstName.compareTo(empl.firstName) != 0)
            return this.firstName.compareTo(empl.firstName);
        if (this.age.compareTo(empl.age) != 0)
            return this.age.compareTo(empl.age);
        if (this.salary.compareTo(empl.salary) != 0)
            return this.salary.compareTo(empl.salary);
        if (this.position.compareTo(empl.position) != 0)
            return this.position.compareTo(empl.position);

        return -this.lastName.compareTo(empl.lastName);
    }
}
