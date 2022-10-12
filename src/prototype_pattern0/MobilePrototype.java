package prototype_pattern0;

public interface MobilePrototype {
    void setSize(String size);
    void printSize();
}




class Samsung implements MobilePrototype{
    private String size;

    public Samsung(String size) {
        this.size = size;
    }

    @Override
    public void setSize(String size) {
        this.size=size;
    }

    public String getSize() {
        return size;
    }

    @Override
    public void printSize() {
        System.out.println("Size: "+getSize());
    }

    public Samsung clone(){
       return new Samsung(this.size);
    }

}






class Main{
    public static void main(String[] args) {
        Samsung samsung= new Samsung("7'' X 5.5''");

        MobilePrototype mp= samsung.clone();
        mp.setSize("6.5'' X 5''");
        mp.printSize();

        mp.setSize("6'' X 5''");
        mp.printSize();

        samsung.printSize();
    }
}