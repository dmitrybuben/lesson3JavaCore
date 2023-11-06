package lesson3.hw;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Employee employee1 = new Worker(1, "Jhon", "Smith", 20, 200);
        Employee employee2 = new Worker(2, "Peter", "Gabriel", 25, 100);
        Employee employee3 = new Freelancer(1, "Billy", "Idol", 27, 25);
        Employee employee4 = new Freelancer(2, "Jhon", "Elton", 28, 15);

        employeeList.add(employee1);
        //System.out.println(employee1.calculateSalary());
        employeeList.add(employee2);
        //System.out.println(employee2.calculateSalary());
        employeeList.add(employee3);
        //System.out.println(employee3.calculateSalary());
        employeeList.add(employee4);
        //System.out.println(employee4.calculateSalary());*/

        //System.out.println(employeeList);
        for (Employee employee : employeeList) {
            System.out.println(employee.calculateSalary());
        }
        Collections.sort(employeeList);

        System.out.println();

        for (Employee employee : employeeList) {
            System.out.println(employee.calculateSalary());
        }
    }
}
