package Day1;

public class javaBasics {
    public static void main(String[] args) {
        System.out.println("Hello, World! from learning java");
        System.out.println("Print ln start from new line");
        System.out.printf("printf start from same line ");
        //this is a single comment
        /* The code below will print the words Hello World
        to the screen, and it is amazing */


        //variables
        int myNum = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";

        // Printing variables
        System.out.println("myNum: " + myNum);
        System.out.println("myFloatNum: " + myFloatNum);
        System.out.println("myLetter: " + myLetter);
        System.out.println("myBool: " + myBool);
        System.out.println("myText: " + myText);

        //Data types
        // Primitive Data Types
        byte myByte = 127;
        short myShort = 32000;
        int myInt = 123456;
        long myLong = 1234567890L;

        float myFloat = 3.14f;
        double myDouble = 3.141592653589793;

        char myChar = 'A';
        boolean myBoolean = true;

        // Reference Data Types
        String myString = "Hello, Java!";
        // Printing values
        System.out.println("byte: " + myByte);
        System.out.println("short: " + myShort);
        System.out.println("int: " + myInt);
        System.out.println("long: " + myLong);
        System.out.println("float: " + myFloat);
        System.out.println("double: " + myDouble);
        System.out.println("char: " + myChar);
        System.out.println("boolean: " + myBoolean);
        System.out.println("String: " + myString);
    //Java Type Casting
        int a=5;
        double mydouble = a;
        System.out.println("Original int value: " + a);
        System.out.println("Converted double value: " + mydouble);


    }
}
