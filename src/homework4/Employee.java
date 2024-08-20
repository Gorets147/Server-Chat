package homework4;

import java.util.concurrent.atomic.AtomicInteger;

public class Employee {
    private String name;
    private int id;
    private int number;
    private byte expYears;

    private static AtomicInteger counter = new AtomicInteger(0);

    public Employee(String name, int number, byte expYears) {
        this.name = name;
        this.number = number;
        id = counter.getAndIncrement();
        if (expYears > 0 && expYears <= 50) {
            this.expYears = expYears;
        } else {
            this.expYears = 0;
        }
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }

    public int getExpYears() {
        return expYears;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", number=" + number +
                ", expYears=" + expYears +
                '}';
    }
}
