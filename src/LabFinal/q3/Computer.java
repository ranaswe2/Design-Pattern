package LabFinal.q3;

public interface Computer {
    void config();
}
class ComputerFactory{

    static Computer getComputer(String ob){
        Computer c=null;
        if(ob.equalsIgnoreCase("Lab-1"))  c= new Lab1();
        else if(ob.equalsIgnoreCase("Lab-2"))  c= new Lab2();
        else if(ob.equalsIgnoreCase("Lab-3"))  c= new Lab3();
        else if(ob.equalsIgnoreCase("Lab-4"))  c= new Lab4();

            return c;
    }

}



class Lab1 implements Computer{
    @Override
    public void config() {
        System.out.println("Processor: Core i5-10400 \nRAM: 8GB 3200GHz\nHard Disc: 1TB HDD\nMonitor: 18 inch");
    }
}


class Lab2 implements Computer{
    @Override
    public void config() {
        System.out.println("Processor: Core i5-11400 \nRAM: 8GB 3200GHz\nHard Disc: 1TB HDD\nMonitor: 24 inch");

    }
}


class Lab3 implements Computer{
    @Override
    public void config() {
        System.out.println("Processor: Core i5-10700 \nRAM: 8GB 3200GHz\nHard Disc: 512GB HDD+256GB\nMonitor: 21 inch");

    }
}


class Lab4 implements Computer{
    @Override
    public void config() {
        System.out.println("Processor: Core i5-11700 \nRAM: 8GB 3200GHz\nHard Disc: 1TB HDD+256GB\nMonitor: 22 inch");

    }
}

class Main{
    public static void main(String[] args) {
        Computer pc1= ComputerFactory.getComputer("Lab-2");
        pc1.config();
        System.out.println("------------------------------------------------------------------------");
        Computer pc2= ComputerFactory.getComputer("Lab-3");
        pc2.config();

    }
}


