package chain_of_responsibility_pattern0;

public abstract class Employee {
    Employee supervisor;

    public void setNextSupervisor(Employee supervisor) {

        this.supervisor = supervisor;
    }

    abstract void applyLeave(String employeeName, int numberOfLeaveDays);
    abstract void approveLeave(String employeeName, int numberOfLeaveDays);
}
