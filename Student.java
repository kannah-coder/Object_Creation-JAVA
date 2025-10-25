class Student {
    String name;
    int marks;
    String section;

    // Method to display student details
    void displayInfo(int studyingIn) {
        System.out.println("Name of the student: " + name);
        System.out.println("Marks of the student: " + marks);
        System.out.println("Section: " + section);
        System.out.println("Class: " + studyingIn);
    }

    // 🆕 1️⃣ Method to check if student passed
    boolean isPassed() {
        return marks >= 40;
    }

    // 🆕 2️⃣ Method to calculate grade
    char grade() {
        if (marks >= 90) return 'A';
        else if (marks >= 75) return 'B';
        else if (marks >= 50) return 'C';
        else return 'F';
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Kannah";
        s1.marks = 100;
        s1.section = "A";
        s1.displayInfo(12);
        System.out.println("Passed: " + s1.isPassed());
        System.out.println("Grade: " + s1.grade());
        System.out.println("-----------------------");

        Student s2 = new Student();
        s2.name = "Peter";
        s2.marks = 64;
        s2.section = "A";
        s2.displayInfo(12);
        System.out.println("Passed: " + s2.isPassed());
        System.out.println("Grade: " + s2.grade());
        System.out.println("-----------------------");

        Student s3 = new Student();
        s3.name = "Mikey";
        s3.marks = 35;
        s3.section = "B";
        s3.displayInfo(11);
        System.out.println("Passed: " + s3.isPassed());
        System.out.println("Grade: " + s3.grade());
        System.out.println("-----------------------");
    }
}
