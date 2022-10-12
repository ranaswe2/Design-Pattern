package lab_test3.composit;

public class CompositMain {
    public static void main(String[] args) {
        Employee developer1= new Developer("Jodu",1200);
        Employee developer2= new Developer("Modhu",1300);
        Employee developer3= new Developer("KODU",1400);
        Employee developer4= new Developer("SIDHU",1500);
        Employee developer5= new Developer("Kanhu",1600);

        Manager assistManager=new Manager("Razu",2000);
        Manager generalManager=new Manager("Rintu",2100);

        assistManager.addEmployee(developer1);
        assistManager.addEmployee(developer3);
        assistManager.addEmployee(developer5);

        generalManager.addEmployee(developer2);
        generalManager.addEmployee(developer4);
        generalManager.addEmployee(assistManager);
        generalManager.printInfo();

    }
}
