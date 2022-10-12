package prototype_pattern0;

import java.util.ArrayList;

public class Employees {
    private String employee;
    ArrayList<String> empList;

    public Employees() {
        this.empList = new ArrayList<>();
    }

    public Employees(ArrayList<String> empList) {
        this.empList = empList;
    }

    public void addEmployee(String employee) {
        empList.add(employee);
    }

    public void removeEmployee(String employee) {
        empList.remove(employee);
    }

    public void printList(){
        for (String emp:empList) {
            System.out.println(emp);
        }
    }

    public Employees clone(){
        ArrayList<String> tempList= new ArrayList<>();
        for (String emp: empList) {
            tempList.add(emp);
        }
        return new Employees(tempList);
    }
}






class ProtoMain{
    public static void main(String[] args) {

        Employees employees= new Employees();
        employees.addEmployee("Rana");
        employees.addEmployee("Razu");
        employees.addEmployee("Naeyym");

        employees.printList();
        System.out.println("..............................................................");
        Employees employees1= employees.clone();
        employees1.addEmployee("Sourav");
        employees1.printList();

        System.out.println("..............................................................");

        Employees employees2= employees.clone();
        employees2.removeEmployee("Naeyym");
        employees2.printList();

        System.out.println("..............................................................");

        employees.printList();
    }
}
