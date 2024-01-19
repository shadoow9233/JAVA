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
        int abc=5;
        double mydouble = abc;
        System.out.println("Original int value: " + abc);
        System.out.println("Converted double value: " + mydouble);

    //
        int a = 10;
        int b = 5;

        // Addition
        int sum = a + b;
        System.out.println("Sum: " + sum);

        // Subtraction
        int difference = a - b;
        System.out.println("Difference: " + difference);

        // Multiplication
        int product = a * b;
        System.out.println("Product: " + product);

        // Division
        int quotient = a / b;
        System.out.println("Quotient: " + quotient);

        // Modulus (remainder)
        int remainder = a % b;
        System.out.println("Remainder: " + remainder);



        // ******* relational operators ******
        int x = 5;
        int y = 10;

        // Equality
        System.out.println("Is x equal to y? " + (x == y));

        // Inequality
        System.out.println("Is x not equal to y? " + (x != y));

        // Greater than
        System.out.println("Is x greater than y? " + (x > y));

        // Less than
        System.out.println("Is x less than y? " + (x < y));

        // Greater than or equal to
        System.out.println("Is x greater than or equal to y? " + (x >= y));

        // Less than or equal to
        System.out.println("Is x less than or equal to y? " + (x <= y));

        // ***********logical operators ****
        boolean A = true;
        boolean B = false;

        // Logical AND
        System.out.println("Logical AND: " + (A && B));

        // Logical OR
        System.out.println("Logical OR: " + (A || B));

        // Logical NOT
        System.out.println("Logical NOT for a: " + !A);
        System.out.println("Logical NOT for b: " + !B);
    }
}
