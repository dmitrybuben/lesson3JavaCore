package lesson3.hw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Freelancer extends Employee {

    private List<Freelancer> freelancers = new ArrayList<>();
    private int index = 0;

    private double hourPayRate;

    public double getHourPayRate() {
        return hourPayRate;
    }

    public void setHourPayRate(double hourPayRate) {
        this.hourPayRate = hourPayRate;
    }

    public Freelancer(int id, String name, String surname, int age, double hourPayRate) {
        super(id, name, surname, age);
        this.hourPayRate = hourPayRate;
    }

    @Override
    public double calculateSalary() {
        return 20.8 * 8 * hourPayRate;
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
                return index < freelancers.size();
            }

            @Override
            public Employee next() {
                return freelancers.get(index++);
            }
        };
    }
}
