package template_pattern0;

public abstract class TourPackage {
        abstract void basic();
        abstract void foodFacility();

        public void packages(){
            basic();
            foodFacility();
        }

}


class EconomyClass extends TourPackage{

    @Override
    public void basic() {
        System.out.println("Package Rate: 5000/-\nDuration: 2 Days 1 Night\nResidence: 3 Star Hotel");
    }

    @Override
    void foodFacility() {
        System.out.println("Panta Vat 3 Bela.");
    }


}

class BusinessClass extends TourPackage{

    @Override
    void basic() {

        System.out.println("Package Rate: 8000/-\nDuration: 3 Days 2 Nights\nResidence: 4 Star Hotel");
    }

    @Override
    void foodFacility() {
        System.out.println("Biriani 3 Bela.");
    }
}
