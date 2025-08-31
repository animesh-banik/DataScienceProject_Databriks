
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Overriding the parent class method
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }

    public void fetch() {
        System.out.println("Dog is fetching the ball");
    }
}

public class InheritanceCheck {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();  // Calls overridden method
        dog.fetch();      // Calls child class method
    }
}
