package javaOop;

public class thiskeyword2 {

    private int x;
    private int y;
    // Constructor with parameters having the same names as instance variables
    public thiskeyword2(int x, int y) {
        // Use 'this' to differentiate between instance variables and parameters
        this.x = x;
        this.y = y;
    }

    // Method to set values using 'this' to invoke the current object's method
    public void setValues(int x, int y) {
        // Invoking the current object's method to set values
        this.setX(x);
        this.setY(y);
    }

    // Method to display values
    public void displayValues() {
        System.out.println("x: " + x + ", y: " + y);
    }

    // Method to set x using 'this' to pass the current object as a parameter
    private void setX(int x) {
        this.x = x;
    }

    // Method to set y using 'this' to pass the current object as a parameter
    private void setY(int y) {
        this.y = y;
    }
    public static void main(String[] args) {
        // Creating an object using the constructor with parameters
        thiskeyword2 e1 = new thiskeyword2(10, 20);

        // Displaying initial values
        System.out.println("Initial values:");
        e1.displayValues();

        // Setting new values using the setValues method
        e1.setValues(30, 40);

        // Displaying updated values
        System.out.println("Updated values:");
        e1.displayValues();
    }

}
