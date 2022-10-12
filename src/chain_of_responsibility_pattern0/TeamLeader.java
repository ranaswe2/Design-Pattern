package chain_of_responsibility_pattern0;

public class TeamLeader extends Employee{
    int maxApprovedDays=10;

    @Override
    void applyLeave(String employeeName, int numberOfLeaveDays) {

        if(numberOfLeaveDays<=maxApprovedDays){
            approveLeave(employeeName, numberOfLeaveDays);
        }
        else {
            supervisor.applyLeave(employeeName, numberOfLeaveDays);
        }
    }

    @Override
    void approveLeave(String employeeName, int numberOfLeaveDays) {
        System.out.println("TeamLeader approved " + numberOfLeaveDays + " days " + "Leave for the employee : "
                + employeeName);
    }
}
