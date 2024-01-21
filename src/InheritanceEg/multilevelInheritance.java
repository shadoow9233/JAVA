package InheritanceEg;
// Parent class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Child class 1
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Child class 2
class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}
public class multilevelInheritance {
    public static void main(String[] args) {
        // Creating an object of Dog class
        Dog myDog = new Dog();
        myDog.eat(); // Inherited from Animal class
        myDog.bark(); // Specific to Dog class

        // Creating an object of Cat class
        Cat myCat = new Cat();
        myCat.eat(); // Inherited from Animal class
        myCat.meow(); // Specific to Cat class
    }
}
