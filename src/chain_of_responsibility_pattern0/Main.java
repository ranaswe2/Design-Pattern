package chain_of_responsibility_pattern0;

public class Main {
    public static void main(String[] args) {

        TeamLeader teamLeader= new TeamLeader();
        ProjectLeader projectLeader= new ProjectLeader();
        HR hr= new HR();

        teamLeader.setNextSupervisor(projectLeader);
        projectLeader.setNextSupervisor(hr);

        teamLeader.applyLeave("Razu",5);
        teamLeader.applyLeave("Rana",15);
        teamLeader.applyLeave("Ritu",25);
        teamLeader.applyLeave("Roki",35);
    }
}
