class Student{
    String name;
    int age;
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void displayStudent(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}

class GraduateStudent extends Student{
    String specialization = "Computer Science";
    public GraduateStudent(String name, int age, String specialization){
        super(name,age);
        this.specialization = specialization;
    }
public void displayGraduateStudent(){
    displayStudent();
        System.out.println("Specialization: "+specialization);
}
        }

class Practice4{
    public static void main(String args[]){
        GraduateStudent stu = new GraduateStudent("Anika",26,"Computer Science");
        stu.displayGraduateStudent();
    }
}