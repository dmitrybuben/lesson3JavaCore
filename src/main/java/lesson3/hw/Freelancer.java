package lesson3.hw;

public class Freelancer extends Employee {

    private int hourPayRate = 100;

    public int getHourPayRate() {
        return hourPayRate;
    }

    public void setHourPayRate(int hourPayRate) {
        this.hourPayRate = hourPayRate;
    }

    public Freelancer(int id, String name, String surname, int age, double salary) {
        super(id, name, surname, age);
        salary = calculateSalary();
    }

    @Override
    public double calculateSalary() {
        return 20.8 * 8 * hourPayRate;
    }
}
