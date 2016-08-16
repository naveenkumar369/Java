package ch02.sec04;

public class Employee {
    private static int lastid = 0;
    private int id;
    private String name;
    private double salary;

    public Employee() {
        lastid++;
        id = lastid;
    }

    public Employee(String name, double salary) {
        this();
        this.name = name;
        this.salary = salary;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public String getName() { return name; }

    public double getSalary() { return  salary; }

    public int getId() { return  id; }
}
