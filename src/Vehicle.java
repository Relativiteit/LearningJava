public class Vehicle extends Crashable implements  Drivable  {

    int numOfWheels = 2;
    double theSpeed = 0;
    int carStrength = 0;


    @Override
    public int getWHeels() {
        return this.numOfWheels;
    }

    @Override
    public void setWheels(int numWHeels) {
        this.numOfWheels = numWHeels;
    }

    @Override
    public double getSpeed() {
        return this.theSpeed;
    }

    @Override
    public void setSpeed(double speed) {
    this.theSpeed = speed;
    }
    //   constructor
    public Vehicle(int wheels, double speed){
        this.numOfWheels = wheels;
        this.theSpeed = speed;
    }
    // remove abstract when copying from abastract class
    public void setCarStrength(int carStrength){
        this.carStrength = carStrength;
    };

    public int getCarStrength(){
        return this.carStrength;
    };
}

