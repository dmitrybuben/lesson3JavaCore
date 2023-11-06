package lesson3.hw;

public class Worker extends Employee{

    private double fixedMonthPayment = 100;

    public double getFixedMonthPayment() {
        return fixedMonthPayment;
    }

    public void setFixedMonthPayment(double fixedMonthPayment) {
        this.fixedMonthPayment = fixedMonthPayment;
    }

    public Worker(int id, String name, String surname, int age, double salary) {
        super(id, name, surname, age);
        salary = calculateSalary();
    }

    @Override
    public double calculateSalary() {
        return fixedMonthPayment;
    }
}
