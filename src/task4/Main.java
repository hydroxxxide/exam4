package task4;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Мяукалка");
        Dog dog = new Dog("Бобик");
        Parrot parrot = new Parrot("Кеша");
        HashMap<String, Pet> pets = new HashMap<>();
        pets.put(cat.getName(), cat);
        pets.put(dog.getName(), dog);
        pets.put(parrot.getName(), parrot);
        printKeys(pets);
    }
    public static void printKeys(HashMap pets){

    }
}
