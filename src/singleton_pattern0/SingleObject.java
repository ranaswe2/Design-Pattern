package singleton_pattern0;

public class SingleObject {
    private static SingleObject object;

    private SingleObject() {  }

    public static SingleObject getInstance(){
        if(object==null){
            object= new SingleObject();
        }
        return object;
    }

    public void showMessage(){
        System.out.printf("Joy Bangla");
    }
}



class Main {
    public static void main(String[] ob) {

        SingleObject object1= SingleObject.getInstance();
        System.out.println(object1);

        SingleObject object2= SingleObject.getInstance();
        System.out.println(object2);

        object2.showMessage();



    }
}