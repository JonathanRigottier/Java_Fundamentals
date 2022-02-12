package advanced;

interface BugInterface{
    public void bugSound();
    public void bugSize();
}

interface Building{
    public void buildingPlan();
    public void costManagement();
}

interface Place{
    public void location();
}

class house implements Building, Place{

    public void buildingPlan() {
        System.out.println("AZERTY");
    }

    public void costManagement() {
        System.out.println("180000");
    }

    public void location() {
        System.out.println("Australia");
    }
}

class Ant1 implements BugInterface, Place{

    public void bugSize() {
        System.out.println("Small");
    }

    public void bugSound() {
        System.out.println("Tsss");
    }

    public void location() {
        System.out.println("Estonia");
    }
}



public class InterfaceExample {
    public static void main(String[] args) {
        Ant1 ant1 = new Ant1();
        ant1.bugSize();
        ant1.bugSound();
        ant1.location();

        house house = new house();
        house.buildingPlan();
        house.costManagement();
        house.location();
    }
}
