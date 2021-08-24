package firsttwochapters;// abstract class, every method does not need to be
// implemented to use Crashable class

public abstract class Crashable {
    boolean carDrivable = true;

    public void youCrashed(){
        this.carDrivable = false;
    }
    public abstract void setCarStrength(int carStrength);

    public abstract int getCarStrength();

}
