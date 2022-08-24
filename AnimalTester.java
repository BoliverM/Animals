package ANIMALS;

public class AnimalTester {
    public static void main(String[] args) {
        Dog dog = new Dog("husky", "mammal", 5);
        dog.info();

        Cat cat = new Cat("Baki", "mammal", 14, 55);
        cat.info();

        Bird bird = new Bird("Lori", 20, 10);
        bird.info();

    }
}
