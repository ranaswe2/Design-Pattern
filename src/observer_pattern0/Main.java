package observer_pattern0;

public class Main {
    public static void main(String[] args) {
        Notice noticeS= new Notice();

        Student studentA= new Student("Rana");
        Student studentB= new Student("Razu");
        Student studentC= new Student("Sourv");
        Student studentD= new Student("Nayeem");
        studentA.subscrib(noticeS);
        studentD.subscrib(noticeS);
        noticeS.update("Your Design Pattern CT will be held on Next Monday");
        studentD.unSubscrib(noticeS);
        noticeS.update("Next Sunday is holyday!");

        Notice noticeT= new Notice();

        Teacher teacherA= new Teacher("Eusha Kader");
        Teacher teacherB= new Teacher("Dipok Ch. Das");
        Teacher teacherC=  new Teacher("Nazmun Nahar");
        Teacher teacherD=  new Teacher("Iftekhar Alam");
        teacherA.subscrib(noticeT);
        teacherB.subscrib(noticeT);
        noticeT.update("You are requested to take Design Pattern CT Next Monday");


    }
}
