class Student {
    String name;
    Student(String n) {
        name = n;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Kannah"); // regular object creation
        System.out.println(s1.name);
    }
}
