package visitor_pattern0;

public class Main {
    public static void main(String[] args) {

        Salary e= new Employee("Raju");
        SalaryCalculator s= new SalaryCalculator();
        System.out.println(e);
        e.accept(s);

    }
}
