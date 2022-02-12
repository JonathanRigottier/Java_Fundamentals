package HomeworkCheck;

public class Car extends VehicleWithTeacher{

    private boolean airConditioner;

    public Car(float fuel, float fuelUsage, int passengers,boolean airConditioner ){
        super(fuel, fuelUsage, passengers);
        this.airConditioner = airConditioner;
    }

    public float maxDistance(){
        float airConditionerAdd;
        if(airConditioner){
            airConditionerAdd = 1.1f;
        }else{
            airConditionerAdd = 1f;
        }
        float usage = fuelUsage * (1 + passengers * 0.05f);
        return fuel / (usage * airConditionerAdd) * 100;

    }


}
