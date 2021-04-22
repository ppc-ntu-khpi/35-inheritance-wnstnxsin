package test;

import domain.Dog;

/**
 *
 * @author ДОМ
 */
public class TestAnimal {

    public static void main(String[] args) {
        Dog Dog = new  Dog("Bim");
        System.out.println(Dog);
        Dog.guard();
        Dog.eat();
        Dog.speak();
    }
}
