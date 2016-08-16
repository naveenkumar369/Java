package ch02.sec03;

import ch02.sec02.*;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee james = new Employee("James", 500000);
            //Calls Employee(String, double) constructor
        Employee annonymus = new Employee("", 40000);
            //Calls Employee (double) constructor
        Employee unpaid = new Employee("Igor Intern");

        Employee e = new Employee();
           //No-arg constructor

    }
}
