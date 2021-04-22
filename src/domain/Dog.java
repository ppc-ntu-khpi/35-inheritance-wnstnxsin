package domain;

public class Dog extends watcher {

    private String kind;

    public Dog(String name, int weight, int growth, String color) {
        this.name=name;
        this.weight=weight;
        this.growth=growth;
        this.color=color;
    }

    public Dog() {
        this("Dull",10,1,"black");
    }

    public Dog(String name) {
        this(name,10,1,"black");
    }

    @Override
    public void guard() {
        System.out.println("Dog is guarding the house!");
    }

    @Override
    public String toString() {
        return super.toString()+"\t"+"\n\nThis the Dog!";
    }

    @Override
    public void speak() {
        System.out.println("Gow! Gow!");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats bone!");
    }
}
