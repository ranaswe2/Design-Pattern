package bridge_pattern1;

public interface MoveLogic {
    public void move();
}

class Walk implements MoveLogic{
    @Override
    public void move() {
        System.out.println("Move alternating legs.");
    }
}

class Fly implements MoveLogic{
    @Override
    public void move() {
        System.out.println("Flap wings.");
    }
}



interface Animal{
    void howToMove();
}

class Human implements Animal{
    MoveLogic moveLogic;

    public Human(MoveLogic moveLogic) {
        this.moveLogic = moveLogic;
    }

    @Override
    public void howToMove() {
        moveLogic.move();
    }
}
class Bird implements Animal{
    MoveLogic moveLogic;

    public Bird(MoveLogic moveLogic) {
        this.moveLogic = moveLogic;
    }

    @Override
    public void howToMove() {
        moveLogic.move();
    }
}

class  Main{
    public static void main(String[] args) {
        MoveLogic ml1= new Walk();
        MoveLogic ml2= new Fly();

        Animal human= new Human(ml1);
        human.howToMove();

    }
}
