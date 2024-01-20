package javaOop;

public class classObject {
    public static class number{    //number is a class with attributes x
        int x=5;
    }
    public static class Sum {
        int num1;
        int num2;

        public Sum(int a, int b) {
            this.num1 = a;
            this.num2 = b;
        }

        // Method to perform addition
        public int addition() {
            return num1 + num2;
        }
    }

    public static void main(String[] args) {
        number n=new number(); //n is a object of a class number
        System.out.println(n.x);
        // Creating an object of the Sum class and using the constructor
        // one class may have more than one object
        Sum s1 = new Sum(10, 20);
        Sum s2 = new Sum(11, 20);
        Sum s3 = new Sum(33, 20);

        // Calling the addition method and displaying the result
        System.out.println("Sum: " + s1.addition());
        System.out.println("Sum: " + s2.addition());
        System.out.println("Sum: " + s3.addition());

    }
}
