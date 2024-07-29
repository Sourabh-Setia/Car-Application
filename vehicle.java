public class vehicle {
    private  String name;
    private int currentSpeed;
    private int currentDirection;

    public vehicle(String name) {
        this.name = name;
        this.currentSpeed =0;
        this.currentDirection = 0;
    }

    public void steer(int direaction){
        this.currentDirection += direaction;
        System.out.println("Steer method called: " + "Currenty steering at " + currentDirection + "degrees");
    }

    public void move(int speed, int direaction){
        currentSpeed = speed;
        currentDirection = direaction;
        System.out.println("Move method called, Moving the vehicle at " + currentSpeed + "Speed in " + currentDirection +"Degrees");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void stop(){
        this.currentSpeed =0;
        System.out.println("Your car stopped");
    }
}
