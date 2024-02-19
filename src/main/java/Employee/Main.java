package Employee;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Main {



    public static void main(String[] args) {

        Company company = new Company();

        //Creating an example couple of Workplaces

        WorkplaceAddress workplaceAddress1 = new WorkplaceAddress("Czekoladowa", (short) 1, (short) 1, "Wrocław");
        WorkplaceAddress workplaceAddress2 = new WorkplaceAddress("Sportowa", (short) 2, (short) 3, "Łódź");
        WorkplaceAddress workplaceAddress3 = new WorkplaceAddress("Łabędzia", (short) 4, (short) 5, "Wrocław");
        WorkplaceAddress workplaceAddress4 = new WorkplaceAddress("Łabędzia", (short) 4, (short) 5, "Wrocław");

        //Creating an example List of employees

        Employee worker1 = new OfficeEmployee("Karol", "Szul", (byte)29, (byte)9, workplaceAddress1, (byte)15, (short)14);
        Employee worker2 = new PhysicalEmployee("Imbir", "Kotek", (byte)5, (byte)3, workplaceAddress2,  (byte)14 );
        Employee worker3 = new SalespersonEmployee("Jordan", "Belfort", (byte)11, (byte)7, workplaceAddress3,
                Efficiency.HIGH, 1.0 );
        Employee worker4 = new SalespersonEmployee("Jordan", "Belfort", (byte)11, (byte)7, workplaceAddress3,
                Efficiency.HIGH, 1.0 );


        company.addEmployee(worker1);
        company.addEmployee(worker2);
        company.addEmployee(worker3);
        company.addEmployee(worker4);


        //Displaying employees by experience
        List<Employee> sortedEmployeeListByExperience =
                company.displayAllEmployeesByExperience();

        System.out.println("\nDisplaying List of Employees by Experience desc: \n");

        for (Employee e: sortedEmployeeListByExperience) {
            System.out.println(e.toString());
        }

        //Displaying employees by age
        List<Employee> sortedEmployeeListByAge =
                company.displayAllEmployeesByAge();

        System.out.println("\nDisplaying List of Employees by Age asc: \n");

        for (Employee e: sortedEmployeeListByAge) {
            System.out.println(e.toString());
        }

        //Displaying employees by name
        List<Employee> sortedEmployeeListByName =
                company.displayAllEmployeesByNameAlphabetically();

        System.out.println("\nDisplaying List of Employees by Name asc: \n");

        for (Employee e: sortedEmployeeListByName) {
            System.out.println(e.toString());
        }

        //Displaying employees from a given city

        List<Employee> employeesFromAGivenCity =
                company.displayAllEmployeesWorkingInAGivenCity("Wrocław");

        System.out.println("\nDisplaying a List of Employees from a Given City: \n");

        for (Employee e: employeesFromAGivenCity) {
            System.out.println(e.toString());
        }

        //Displaying employees with their value

        System.out.println("\nDisplaying a List of Employees with their value: \n");

        for (Employee e: company.employeeList) {
            System.out.println(e.toString() + " with value of: " + e.getEmployeeValue());
        }

        boolean compare = company.isEmployeeTheSame(worker3, worker4);

        System.out.println("\n" +compare);


//        System.out.println("Displaying List of Employees: \n");
//
//        for (Employee e: exampleList) {
//
//            System.out.println(e.toString());
//        }
//
//
//        String name = new String("Karol");
//        String name3 = new String("Karol");
//        String name2 = "Karol";


    }
}
