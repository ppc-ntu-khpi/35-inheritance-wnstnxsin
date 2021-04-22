package domain;

public class Animal {

    protected String name;

    protected int weight;

    protected int growth;

    protected String color;

    public Animal() {
        name="generic animal";
        weight=15;
    }

    public void eat() {
        System.out.println("Animal eating!");
    }

    public void speak() {
        System.out.println("Animal speaking!");
    }

    @Override
    public String toString() {
        return "Animal{" + "name=" + name + ", weight=" + weight + ", growth=" + growth + ", color=" + color + '}';
    }
}
