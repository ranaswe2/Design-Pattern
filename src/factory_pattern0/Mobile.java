package factory_pattern0;

public abstract class Mobile {

    abstract String getCompanyName();
    abstract String displaySize();

    @Override
    public String toString() {
        return "Company Name: "+this.getCompanyName()+"\nDisplay Size: "+this.displaySize();
    }
}

class Samsung extends Mobile{

    @Override
    String getCompanyName() {
        return "Samsung";
    }

    @Override
    String displaySize() {
        return "7'' X 5.5''";
    }
}

class Oppo extends Mobile{

    @Override
    String getCompanyName() {
        return "Oppo";
    }

    @Override
    String displaySize() {
        return "6'' X 5''";
    }
}

class Vivo extends Mobile{

    @Override
    String getCompanyName() {
        return "Vivo";
    }

    @Override
    String displaySize() {
        return "6.5'' X 5.5''";
    }
}
