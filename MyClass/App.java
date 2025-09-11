package MyClass;

public class App {
    public static void main(String[] args) {

        Student myStudent = new Student();
        myStudent.firstname = "Jim";
        myStudent.lastname = "Halpert";
        myStudent.major = "business";
        myStudent.gpa = 2.3;
        myStudent.age = 24;
        myStudent.onProbation = false;

        Student myStudent2 = new Student();
        myStudent2.firstname = "Pam";
        myStudent2.lastname = "Beasley";
        myStudent2.major = "Art";
        myStudent2.gpa = 2.3;
        myStudent2.age = 23;
        myStudent2.onProbation = true;

        System.out.println(myStudent.firstname);
        System.out.println(myStudent.lastname);
        System.out.println(myStudent.age);
        System.out.println("");
        System.out.println(myStudent2.firstname);
        System.out.println(myStudent2.lastname);
        System.out.println(myStudent2.major);
        System.out.println(myStudent2.gpa);

    }
}
