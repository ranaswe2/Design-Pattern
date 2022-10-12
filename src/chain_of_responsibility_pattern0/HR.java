package chain_of_responsibility_pattern0;

public class HR  extends Employee{
    int maxApprovedDays=30;

    @Override
    void applyLeave(String employeeName, int numberOfLeaveDays) {
        if(numberOfLeaveDays<=maxApprovedDays){
            approveLeave(employeeName, numberOfLeaveDays);
        }
        else {
            System.out.println("Impossible to approve "+numberOfLeaveDays+" days of Leave for the employee : " +employeeName);
        }
    }

    @Override
    void approveLeave(String employeeName, int numberOfLeaveDays) {
        System.out.println("HR approved " + numberOfLeaveDays + " days " + "Leave for the employee : "
                + employeeName);
    }
}
