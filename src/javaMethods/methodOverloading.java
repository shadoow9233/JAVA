package javaMethods;

public class methodOverloading {
    // Method with two integer parameters
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    // Method with three integer parameters
    public int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    // Method with two double parameters
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    // Method with a String parameter
    public String concatenate(String str1, String str2) {
        return str1 + str2;
    }

    public static void main(String[] args) {
        //Definition : multiple methods can have the same name with different parameters
        // Calling methods with different parameter sets
        methodOverloading m = new methodOverloading();
        int sum1 = m.add(2, 3);
        System.out.println("Sum1: " + sum1);

        int sum2 = m.add(1, 5, 7);
        System.out.println("Sum2: " + sum2);

        double sum3 = m.add(2.5, 3.5);
        System.out.println("Sum3: " + sum3);

        String result = m.concatenate("Hello, ", "World!");
        System.out.println("Concatenation: " + result);
    }
}
