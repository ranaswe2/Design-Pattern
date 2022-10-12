package factory_pattern0;

public class FactoryMobile {
    static Mobile mobile=null;

    public static Mobile searchMobile(String companyName){
        if(companyName.equals("samsung")){
            mobile=new Samsung();
        }
        else if (companyName.equals("oppo")) {
            mobile= new Oppo();
        }
        else if (companyName.equals("vivo")) {
            mobile=new Vivo();
        }

        return mobile;
    }
}
