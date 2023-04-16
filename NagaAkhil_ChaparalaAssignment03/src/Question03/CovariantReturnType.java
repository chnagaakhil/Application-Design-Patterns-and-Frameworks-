package Question03;

class Animal {
    public Animal getAnimal() {
        System.out.println("Animal is the parent class");
        return new Animal();
    }
}

class Cat extends Animal {
    @Override
    public Cat getAnimal() {
        System.out.println("Cat is a subclass of Animal");
        return new Cat();
    }
}

public class CovariantReturnType {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.getAnimal();

        Cat cat = new Cat();
        cat.getAnimal();
    }
}

