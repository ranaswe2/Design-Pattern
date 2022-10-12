package visitor_pattern0;

public interface Salary {
    void accept(Visitor visitor);
}

class Employee implements Salary{
    String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public void accept(Visitor visitor) {
visitor.employeeSalary();
    }

    @Override
    public String toString() {
        return "Name: "+name;
    }
}






class Manager implements Salary{

    String name;

    public Manager(String name) {
        this.name = name;
    }

    @Override
    public void accept(Visitor visitor) {
visitor.managerSalary();
    }

    @Override
    public String toString() {
        return "Name: "+name;
    }
}





