class Student {
    String name;
    int marks;
    String section;
    void displayInfo(int studingIn){
        System.out.println("Name of the student:"+name);
        System.out.println("Marks of the student:"+marks);
        System.out.println("Section:"+section); 
        System.out.println("classs:"+studingIn);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(); // regular object creation
        s1.name="kannah";
        s1.marks=100;
        s1.section="A";
        s1.displayInfo(12);
        //display detailts 

        Student s2 = new Student(); // Another object creation
        s2.name="Peter";
        s2.marks=64;
        s2.section="A";
        s2.displayInfo(12);


        Student s3 = new Student(); // Another object creation
        s3.name="Mikey";
        s3.marks=76;
        s3.section="B";
        s3.displayInfo(11);
    }
}
