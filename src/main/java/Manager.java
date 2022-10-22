import java.util.ArrayList;

public class Manager extends Employee {
    private final double bonus;

    public Manager(String name, double salary, double bonus) {
        this.id = nextId++;

        this.name = name;

        this.salary = salary;

        this.bonus = bonus;

        this.subordinate = new ArrayList<>();
    }

    public void PrintEmployee() {
        System.out.println("Manager info: id = " + id + " Name = " + name + " Salary = " + salary + " Bonus = " + bonus);
    }
}