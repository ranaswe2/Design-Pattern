package abstract_factory0;

public class FactoryProducer {
    public static AbstractFactory getFactory(String type){
        AbstractFactory afactory= null;

        if(type.equalsIgnoreCase("rounded")){
            afactory= new RoundedShapeFactory();
        } else if(type.equalsIgnoreCase("raw")){
            afactory= new ShapeFactory();
        }

        return afactory;
    }
}
