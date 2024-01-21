package InheritanceEg;
/*
class A {
    // ...
}

class B extends A {
    // ...
}

class C extends A {
    // ...
}


 */
// Superclass
class Student {
    private String name;
    private int studentId;

    // Constructor
    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    // Common method
    public void study() {
        System.out.println(name + " is studying");
    }
}

// Subclass 1
class UndergraduateStudent extends Student {
    private int year;

    // Constructor
    public UndergraduateStudent(String name, int studentId, int year) {
        super(name, studentId);
        this.year = year;
    }

    // Additional method
    public void attendClass() {
        System.out.println(getName() + " is attending undergraduate classes in year " + year);
    }
}

// Subclass 2
class GraduateStudent extends Student {
    private String researchTopic;

    // Constructor
    public GraduateStudent(String name, int studentId, String researchTopic) {
        super(name, studentId);
        this.researchTopic = researchTopic;
    }

    // Additional method
    public void conductResearch() {
        System.out.println(getName() + " is conducting research on " + researchTopic);
    }
}

public class hireachicalEx {
    public static void main(String[] args) {
        // Creating objects of the subclasses
        UndergraduateStudent undergrad = new UndergraduateStudent("John Doe", 12345, 2);
        GraduateStudent gradStudent = new GraduateStudent("Jane Smith", 67890, "Machine Learning");

        // Invoking methods from the superclass and subclasses
        undergrad.study();      // Inherited from Student class
        undergrad.attendClass(); // Specific to UndergraduateStudent

        gradStudent.study();           // Inherited from Student class
        gradStudent.conductResearch(); // Specific to GraduateStudent
    }

}
