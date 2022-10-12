package lab_test3.composit;

import java.util.ArrayList;
import java.util.Iterator;

public interface Employee {
    String getName();
    double getSalary();
    void printInfo();
}

interface IManager{
    void addEmployee(Employee employee);
    void removeEmployee(Employee employee);
}




class Manager implements Employee,IManager{

    String name;
    double salary;

    ArrayList<Employee> employees=new ArrayList<>();

    public Manager(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void printInfo() {
        System.out.println("Name: "+getName()+"  Salary: "+getSalary());

        Iterator<Employee> employeeIterator=employees.iterator();
        while (employeeIterator.hasNext()){
            Employee employee=employeeIterator.next();
            employee.printInfo();
        }
    }

    @Override
    public void addEmployee(Employee employee) {
         employees.add(employee);
    }

    @Override
    public void removeEmployee(Employee employee) {
        employees.add(employee);
    }
}




class Developer implements Employee{

    String name;
    double salary;


    public Developer(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void printInfo() {
        System.out.println("Name: "+getName()+"  Salary: "+getSalary());

    }

}

