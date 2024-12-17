public class StudentClass {
    // Attributes
    public int id;
    public String name;
    public int age;
    public int numberOfSubjects;

    // Default Constructor : attributes -> garbage
    public StudentClass() {
        System.out.println("StudentClass default constructor called");
    }

    // Parameterized Constructor
    public StudentClass(int id, String name, int age, int numberOfSubjects) {
        System.out.println("StudentClass parameterized constructor called");
        this.id = id;
        this.name = name;
        this.age = age;
        this.numberOfSubjects = numberOfSubjects;
    }

    // Copy Constructor
    public StudentClass(StudentClass source) { // source -> B
        System.out.println("StudentClass copy constructor called");  
        this.id = source.id;
        this.name = source.name;
        this.age = source.age;
        this.numberOfSubjects = source.numberOfSubjects;
    }

    // Methods or Behaviours
    public void study() {
        System.out.println(name + " is studying");
    }
    public void sleep() {
        System.out.println(name + " is sleeping");
    }
    public void bunk() {
        System.out.println(name + " is bunking");
    }    
} 