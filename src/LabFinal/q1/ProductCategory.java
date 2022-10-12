package LabFinal.q1;

public interface ProductCategory {
    String getName();
    String visit(ProductVisitor visitor);
}

class Plastic implements ProductCategory{

    ProductVisitor visitor;

    @Override
    public String getName() {
        return "Plastic";
    }

    @Override
    public String visit(ProductVisitor visitor) {
        return visitor.plastics();
    }
}

class Electronic  implements ProductCategory{

    @Override
    public String getName() {
        return "Electronics";
    }

    @Override
    public String visit(ProductVisitor visitor) {
        return visitor.plastics();
    }
}


class Vegitable  implements ProductCategory{

    @Override
    public String getName() {
        return "Vegitable";
    }

    @Override
    public String visit(ProductVisitor visitor) {
        return visitor.plastics();
    }
}










interface ProductVisitor{
    String electronics();
    String plastics();
    String vegitable();
}

class DiscountVisitor implements ProductVisitor{

    @Override
    public String electronics() {
        return "20";
    }

    @Override
    public String plastics() {
        return "10";
    }

    @Override
    public String vegitable() {
        return "5";
    }
}
class ReturnPolicyVisitor implements ProductVisitor{

    @Override
    public String electronics() {
        return "60";
    }

    @Override
    public String plastics() {
        return "30";
    }

    @Override
    public String vegitable() {
        return "0";
    }
}
class ShippingPolicyVisitor implements ProductVisitor{

    @Override
    public String electronics() {
        return "Amazon";
    }

    @Override
    public String plastics() {
        return "Sundarban";
    }

    @Override
    public String vegitable() {
        return "Sohoj";
    }
}


class Main{
    public static void main(String[] args) {
        ProductVisitor discountVisitor= new DiscountVisitor();
        ProductVisitor returnVisitor= new ReturnPolicyVisitor();
        ProductVisitor shippingVisitor= new ShippingPolicyVisitor();

        ProductCategory plastic= new Plastic();
        System.out.println("Category: "+plastic.getName());
        System.out.println("Discount: "+plastic.visit(discountVisitor)+"%");
        System.out.println("Return: "+plastic.visit(returnVisitor)+" Days");
        System.out.println("Vendor: "+plastic.visit(shippingVisitor)+"");
    }
}