package command_pattern1;

public class Engine {
    boolean on;
    int speed;
    Cockpit cockpit;

    public Engine() {
        this.on = false;
        this.speed = 0;
    }

    public void speedUp(){
       // if (on==true){
            if(this.speed==1200) return;/*
             if (this.speed<800 && this.speed>300) this.cockpit.fly();
             if (this.speed<=300) this.cockpit.land();
             if (this.speed>800) this.cockpit.takeOff();
*/
            this.speed= this.speed+100;/*
        }
        else System.out.println("Power off!");*/
    }

    public void speedDown(){
            if(speed==0) return;
            speed= speed-100;
    }

    public void powerOn(){
        this.on=!this.on;
    }

    @Override
    public String toString() {
        return "Power On: " + on +
                ", Speed: " + speed;
    }
}
