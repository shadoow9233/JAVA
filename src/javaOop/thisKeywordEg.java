package javaOop;

public class thisKeywordEg {
    //1. To Avoid Ambiguity
    private int myNumber;
    // Constructor with parameter having the same name as the instance variable
    public  thisKeywordEg(int myNumber){
        // Using 'this' to refer to the instance variable
        this.myNumber = myNumber;
    }



    public static void main(String[] args) {
        thisKeywordEg num = new thisKeywordEg(5);
        // Accessing the instance variable using the reference variable 'num'
        System.out.println("The number is " + num.myNumber);
    }
}
