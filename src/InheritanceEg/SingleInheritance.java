package InheritanceEg;

// Parent class
class Animals {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Child class inheriting from the Animals class
class Dogs extends Animals {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class SingleInheritance {

    public static void main(String[] args) {
        // Creating an object of the child class (updated to Dogs)
        Dogs myDog = new Dogs();

        // Accessing the methods of the parent class
        myDog.eat(); // Inherited from Animals class

        // Accessing the method of the child class
        myDog.bark();
    }
}
