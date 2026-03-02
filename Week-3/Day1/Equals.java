class Student{
    private String name;
    private int age;

    Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    public int getAge(){
      return age;
    }

    public String getName(){
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        Student other = (Student) obj;
        return this.name.equals(other.name) && this.age == other.age;
    }
}

class Equals{
    public static void main(String args[]){

        Student stu1 = new Student("Anika",26);
        Student stu2 = new Student("Anika",26);
        System.out.println(stu1.getName()+" "+ stu1.getAge());
        System.out.println(stu2.getName()+" "+stu2.getAge());
        System.out.println(stu1.equals(stu2));

    }
}