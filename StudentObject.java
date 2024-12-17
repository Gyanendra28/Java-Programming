public class StudentObject {
    public static void main(String[] args) {
        // Default Constructor
        StudentClass A = new StudentClass();
        A.id = 1;
        A.name = "Rahul";
        A.age = 19;
        A.numberOfSubjects = 5;
        System.out.println(A.id);
        System.out.println(A.name);
        System.out.println(A.age);
        System.out.println(A.numberOfSubjects);
        A.bunk();
        A.study();

        // Parameterized Constructor
        StudentClass B = new StudentClass(2, "Harshit", 18, 3);
        System.out.println(B.id);
        System.out.println(B.name);
        System.out.println(B.age);
        System.out.println(B.numberOfSubjects);
        B.bunk();
        B.study();
        B.sleep();

        // Copy Constructor
        StudentClass C = new StudentClass(B);
        System.out.println(C.id);
        System.out.println(C.name);
        System.out.println(C.age);
        System.out.println(C.numberOfSubjects);
    }
}