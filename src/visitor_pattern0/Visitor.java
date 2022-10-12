package visitor_pattern0;

public interface Visitor {
void employeeSalary();
void managerSalary();
}

class SalaryCalculator implements Visitor{
double empBasic=10000;
double mgrBasic=8000;
    @Override
    public void employeeSalary() {
        System.out.println("Salary: "+empBasic*5);
    }

    @Override
    public void managerSalary() {
        System.out.println("Salary: "+mgrBasic*3);
    }
}
