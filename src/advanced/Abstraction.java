package advanced;

abstract class Bug{
    private String name;

    public void bugSound(){
        System.out.println("pfff");
    }

    public abstract void move();
    public void setName(String name) {this.name = name;}
    public String getName(){ return name; }

}

class Ant extends Bug{
    public void move(){
        System.out.println("Move");
    }

}

class Bee extends Bug{
    public void move(){
        System.out.println("Fly");
    }

    public void gatherHoney(){
        System.out.println("Honey .....");
    }
}


public class Abstraction {
    public static void main(String[] args) {

        Ant ant = new Ant();
        ant.bugSound();
        ant.setName("Bobby");
        System.out.println(ant.getName());
        ant.move();

        Bee bee = new Bee();
        bee.bugSound();
        bee.setName("Barry");
        System.out.println(bee.getName());
        bee.move();
        bee.gatherHoney();
    }
}
