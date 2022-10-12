package composit_pattern0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public interface IEmployee {

    String getName();
    double getSalary();
    void add(IEmployee employee);
    void remove(IEmployee employee);
    IEmployee getChild(int index);
    void print();

}



class Manager implements IEmployee{

    private String name;
    private double salary;

    List<IEmployee> employees= new ArrayList<>();

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
    public void add(IEmployee employee) {
        employees.add(employee);
    }

    @Override
    public void remove(IEmployee employee) {
        employees.remove(employee);
    }

    @Override
    public IEmployee getChild(int index) {
        return employees.get(index);
    }

    @Override
    public void print() {
        System.out.println("Name: "+getName()+"  Salary: "+getSalary());



        Iterator<IEmployee> employeeIterator= employees.iterator();
        while (employeeIterator.hasNext()){
            IEmployee employee= employeeIterator.next();
            employee.print();
        }


    }
}







class Developer implements IEmployee{

    private String name;
    private double salary;

    List<IEmployee> employees= new ArrayList<>();

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
    public void add(IEmployee employee) {
        //employees.add(employee);
    }

    @Override
    public void remove(IEmployee employee) {
        //employees.remove(employee);
    }

    @Override
    public IEmployee getChild(int index) {
        return null;
    }

    @Override
    public void print() {
        System.out.println("Name: "+getName()+"  Salary: "+getSalary());

    }
}




class CompositMain {
    public static void main(String[] args) {
        IEmployee employee1= new Developer("Rintu",1200);
        IEmployee employee3= new Developer("Lokshi",1000);
        IEmployee employee2= new Developer("Borsha",1500);
        IEmployee employee5= new Developer("Rintu",1250);
        IEmployee employee4= new Developer("Porimoni",1300);



        IEmployee manager= new Manager("Rana",2000);
        IEmployee generalManager= new Manager("Razu",2100);

        manager.add(employee1);
        manager.add(employee3);
        manager.add(employee5);

        generalManager.add(employee2);
        generalManager.add(employee4);
        generalManager.add(manager);
        manager.print();

    }
}
