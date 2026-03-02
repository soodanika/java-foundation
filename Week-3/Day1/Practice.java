class Student{
    String name;
    int age;

    Student(String n, int a) {
       name = n;
       age = a;
    }


    void printDetails(){
        System.out.println(name+" "+age);
    }
}

class Practice{
    public static void main(String args[]){
        Student stu1 = new Student("Anika",26);
        stu1.printDetails();
        Student stu2 = new Student("Anshika",18);
        stu2.printDetails();
    }
}