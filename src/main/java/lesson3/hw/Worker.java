package lesson3.hw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Worker extends Employee{

    private List<Freelancer> workers = new ArrayList<>();
    private int index = 0;
    private double fixedMonthPayment = 100.00;

    public Worker(int id, String name, String surname, int age, double fixedMonthPayment) {
        super(id, name, surname, age);
        this.fixedMonthPayment = fixedMonthPayment;
    }

    public double getFixedMonthPayment() {
        return fixedMonthPayment;
    }

    public void setFixedMonthPayment(double fixedMonthPayment) {
        this.fixedMonthPayment = fixedMonthPayment;
    }

    @Override
    public double calculateSalary() {
        return fixedMonthPayment;
    }


    @Override
    public int compareTo(Employee o) {
        if (this.calculateSalary() > o.calculateSalary()){
            return 1;
        }
        if (this.calculateSalary() < o.calculateSalary()){
            return -1;
        }
        return 0;
    }

    @Override
    public Iterator<Employee> iterator() {
        return new Iterator<Employee>() {
            @Override
            public boolean hasNext() {
                return index < workers.size();
            }

            @Override
            public Employee next() {
                return workers.get(index++);
            }
        };
    }
}
