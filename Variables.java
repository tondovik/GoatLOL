// Two types of variabes: instance variables and static variables
// variables use camelCase 
// constants use uppercase

class Student {

    String studentName; // instance variable, belongs to object
    static int studentCount = 0; // static variable, belongs to class
    static final String SCHOOL_NAME = "CSAEA";

    Student(String n) {
        studentName = n; //belong to specific object
        System.out.println(n + " is a student at " + SCHOOL_NAME );

        studentCount++;

        System.out.println("Number of students: " + studentCount);
    }

}

public class Variables {

    public static void main(String[] args) {

        new Student("Joshua uses AI");
        new Student("Chrstopher ROCKS Carlucci");
        new Student("Bernard");
        new Student("Bozzo the indecisive");

        

    }

}
