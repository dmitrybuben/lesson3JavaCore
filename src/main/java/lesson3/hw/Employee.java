package lesson3.hw;

public abstract class Employee {
    int id;
    String name;
    String surname;
    int age;

    public Employee(int id, String name, String surname, int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public abstract double calculateSalary();
}
