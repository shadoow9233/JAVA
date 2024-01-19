package javaMethods;

public class methodEx {
    // Method with no parameters and no return value
    public void sayHello() {
        System.out.println("Hello, World!");
    }

    // Method with parameters and a return value
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        methodEx m = new methodEx();

        // Calling the method with no parameters and no return value
        m.sayHello();

        // Calling the method with parameters and a return value
        int result = m.add(5, 3);
        System.out.println("Sum: " + result);
    }
}
