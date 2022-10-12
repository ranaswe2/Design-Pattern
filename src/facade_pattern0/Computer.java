package facade_pattern0;

public class Computer {
    private CPU cpu;
    private Memory memory;
    private HardDrive drive;

    public Computer(){
        cpu= new CPU();
        memory= new Memory();
        drive= new HardDrive();
    }

    void run(){
        cpu.processedData();
        memory.load();
        drive.writeData();
    }
}

class CPU{
    void processedData(){
        System.out.println("Data is processed...");
    }
}


class Memory{
    void load(){
        System.out.println("Data is loaded...");
    }
}

class HardDrive{
    void writeData(){
        System.out.println("Data is written...");
    }
}