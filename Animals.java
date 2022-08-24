package ANIMALS;

import java.sql.SQLOutput;

public class Animals {
    String name;
    String type; //mammal or reptile
    int age;
    int height;
    int weight;

    void info() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
    }
}

class Dog extends Animals {
    Dog(String name, String type, int age){
        this.name = name;
        this.type = type;
        this.age = age;
    }
}
class Cat extends Animals {
    Cat(String name, String type, int weight, int height) {
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.height = height;
    }
}

class Bird extends Animals {
    Bird(String name,int weight, int height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }
}
