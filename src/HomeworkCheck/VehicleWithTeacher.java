package HomeworkCheck;

public class VehicleWithTeacher {

    protected float fuel;
    protected float fuelUsage;
    protected int passengers;

    public VehicleWithTeacher (float fuel, float fuelUsage, int passengers){
        this.fuel = fuel;
        this.fuelUsage = fuelUsage;
        this.passengers = passengers;
    }

    public float maxDistance(){
        return fuel / (fuelUsage * (1 + passengers * 0.05f)) * 100;
    }

    public VehicleWithTeacher(){}

}
