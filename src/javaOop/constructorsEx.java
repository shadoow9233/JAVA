package javaOop;

public class constructorsEx {
    private  String name;
    private  int age;

    // Default values
    public constructorsEx(){
        this.name = "Guest";
        this.age = 0;
    }
    // Parameterized constructor
    public  constructorsEx(String name, int age){
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getUsername() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        // Creating an object using the default constructor
        constructorsEx defaultUser = new constructorsEx();

        // Creating an object using the parameterized constructor
        constructorsEx customUser = new constructorsEx("Bibek", 25);

        // Accessing and displaying information
        System.out.println("Default User - name: " + defaultUser.getUsername() + ", Age: " + defaultUser.getAge());
        System.out.println("Custom User - name: " + customUser.getUsername() + ", Age: " + customUser.getAge());
    }




}
