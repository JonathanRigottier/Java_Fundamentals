package advanced;

class Vehicule {

    protected float fuel;
    protected float fuelUsage;
    protected int passengers;

    public Vehicule(float fuel, float fuelUsage, int passengers) {
        this.fuel = fuel;
        this.fuelUsage = fuelUsage;
        this.passengers = passengers;
    }

    public void maxDistance() {
        System.out.println(Math.round(((float) (fuel*100 / (fuelUsage * (1.0 + (passengers * 0.05)))))*100.0f)/100.0f);
    }

}

class Car extends Vehicule {

    private boolean airConditioner;
    public Car(float fuel, float fuelUsage, int passengers, boolean airConditioner){
        super(fuel, fuelUsage, passengers);
        this.airConditioner = airConditioner;
    }

    public void maxDistance(){
        if(airConditioner == true){
            System.out.println(Math.round(((float) (fuel * 100 / (fuelUsage * (1.0 + (passengers * 0.05)) * 1.1)))*100.0f)/100.0f);
        }else{
            System.out.println(Math.round(((float) (fuel*100 / (fuelUsage * (1.0 + (passengers * 0.05)))))*100.0f)/100.0f);
        }
    }

}

class MainVehicule {
        public static void main(String[] args) {
            Vehicule vehicule = new Vehicule(70.0f,7.0f,0);
            vehicule.maxDistance();

            Vehicule vehicule1 = new Vehicule(55.5f,5.5f,5);
            vehicule1.maxDistance();

            Car car1 = new Car(70.0f,7.0f,0,true);
            car1.maxDistance();

            Car car2 = new Car(36.1f,8.6f,3,true);
            car2.maxDistance();

            Car car3 = new Car(70.0f,7.0f,0,false);
            car3.maxDistance();

        }
    }







