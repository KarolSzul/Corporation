package Employee;

import java.util.Objects;

abstract class Employee {

    private long id;
    private String firstName;
    private String lastName;
    private byte age;
    private byte experience;


    private WorkplaceAddress workplaceAddress;

    public static long count;

    public Employee(String firstName, String lastName, byte age, byte experience, WorkplaceAddress workplaceAddress) {
        count++;
        this.id = count;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.experience = experience;
        this.workplaceAddress = workplaceAddress;
    }

//    public Employee() {
//    }

    public WorkplaceAddress getWorkplaceAddress() {
        return workplaceAddress;
    }

    public void setWorkplaceAddress(WorkplaceAddress workplaceAddress) {
        this.workplaceAddress = workplaceAddress;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public byte getExperience() {
        return experience;
    }

    public void setExperience(byte experience) {
        this.experience = experience;
    }

    public abstract double getEmployeeValue();

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", experience=" + experience +
                '}' + workplaceAddress.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && experience == employee.experience && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(workplaceAddress, employee.workplaceAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, age, experience, workplaceAddress);
    }
}
