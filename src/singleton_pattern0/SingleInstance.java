package singleton_pattern0;

public class SingleInstance {
    static SingleInstance instance= null;

    private SingleInstance() {
    }

    public static SingleInstance getInstance() {
        if(instance == null)
            instance= new SingleInstance();
        return instance;
    }
}


class Main2{
    public static void main(String[] args) {
        SingleInstance instance= SingleInstance.getInstance();
        System.out.println(instance);
        SingleInstance instance1= SingleInstance.getInstance();
        System.out.println(instance1);
    }
}
