package Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Company {

    List<Employee> employeeList = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void deleteEmployee(long id) {
//        employeeList.removeIf(employee -> employee.getId()==id);
        employeeList
                .stream()
                .filter(e -> e.getId()==id)
                .findAny()
                .ifPresent(employee -> employeeList.remove(employee));
    }

    public void addListOfEmployees(List<Employee> listOfEmployees) {
        employeeList.addAll(listOfEmployees);
    }


        public List<Employee> displayAllEmployeesByExperience() {
        return employeeList
                .stream()
                .sorted((o1, o2) -> o2.getExperience()-o1.getExperience())
                .collect(Collectors.toList());
    }



       public List<Employee> displayAllEmployeesByAge() {
        return employeeList.stream().sorted(Comparator.comparingInt(Employee::getAge))
                .collect(Collectors.toList());
    }



    public List<Employee> displayAllEmployeesByNameAlphabetically() {
        return employeeList.stream().sorted(Comparator.comparing(Employee::getLastName)).collect(Collectors.toList());
    }


        public List<Employee> displayAllEmployeesWorkingInAGivenCity(String city) {
        return employeeList.stream().filter(s -> s.getWorkplaceAddress().getCity().equals(city)).collect(Collectors.toList());
    }



    public boolean isEmployeeTheSame(Employee employee1, Employee employee2) {
        return Objects.equals(employee1, employee2);
    }

}
