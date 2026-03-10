class Student {
    String name;
    int age;
    int rollNumber;
    static int totalStudents;

    Student(String name, int age) {
        this.name = name;
        this.age = age;

        totalStudents++;
        rollNumber = totalStudents;
    }

    void displayDetails() {
        System.out.println("Name: " + name + " Age: " + age + " Roll: " + rollNumber);
    }

    static void totalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }
}

class OOPPractice {
    public static void main(String args[]) {

        Student stu1 = new Student("Alice",21);
        Student stu2 = new Student("Bob",22);

        stu1.displayDetails();
        stu2.displayDetails();

        Student.totalStudents();
    }
}