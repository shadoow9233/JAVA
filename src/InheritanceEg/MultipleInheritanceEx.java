package InheritanceEg;
/*
    interface A {
        // ...
    }

    interface B {
        // ...
    }

    class C implements A, B {
        // ...
    }
 */
//java doesn't support multiple inheritance but it can achive  from interfaces
// Interface 1
interface A {
    void methodA();
}

// Interface 2
interface B {
    void methodB();
}

// Class implementing both interfaces
class MyClass implements A, B {
    public void methodA() {
        System.out.println("Method A");
    }

    public void methodB() {
        System.out.println("Method B");
    }

    // Additional method specific to MyClass
    void myClassMethod() {
        System.out.println("MyClass-specific method");
    }
}
public class MultipleInheritanceEx {
    public static void main(String[] args) {
        MyClass myObject = new MyClass();
        myObject.methodA();
        myObject.methodB();
        myObject.myClassMethod();
    }
}
