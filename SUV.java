public class SUV extends  car{

    public SUV(String name, boolean isManual) {
        super(name, 4, 6, isManual, "SUV", 5);
    }

    public void accelarate(int rate){
        int newSpeed = getCurrentSpeed() + rate;
        /*
        * speed 0 : gear 1
        * speed 0-10 ; gear1
        * speed 10-20 : gear 2
        * speed 20-30 : gear 3
        * speed 30-40 : gear 4
        * speed 40-50 : gear 5
        *gear 6
        * */

        if (newSpeed ==0){
            stop();
            changeGear(1);
        }else if(newSpeed > 0 && newSpeed <=10){
            changeGear(1);
        }else if(newSpeed > 10 && newSpeed <=20){
            changeGear(2);
        }else if(newSpeed > 20 && newSpeed <=30){
            changeGear(3);
        }else if(newSpeed > 30&& newSpeed <=40){
            changeGear(4);
        }else if(newSpeed > 40 && newSpeed <=50){
            changeGear(5);
        }else{
            changeGear(6);
        }

        if(newSpeed > 0){
            ChangeSpeed(newSpeed , getCurrentDirection());
        }

    }
}
