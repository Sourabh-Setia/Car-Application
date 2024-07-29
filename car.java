public class car extends vehicle{

    private int wheels;
    private String type;
    private int gears;
    private int doors;
    private int gear;
    private boolean isManual;
    private  int currentGear;

    public car(String name , int wheels , int gears , boolean isManual , String type , int doors) {
        super(name);
         this.type =type;
         this.gears = gears;
         this.doors = doors;
         this.isManual = isManual;
         this.wheels = wheels;
         currentGear = 1;
    }

    public void changeGear(int newGear){
        this.currentGear = newGear;
        System.out.println("ChangeGear called, current gear is  " + this.currentGear);
    }

    public void ChangeSpeed(int newSpeed , int newDireaction){
        move(newSpeed , newDireaction);
        System.out.println("Speed and direaction changed new speed is " + newSpeed + " and new direaction is " + newDireaction);

    }
}
