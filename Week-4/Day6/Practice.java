class Person {
    String name;
    int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void displayPerson() {
        System.out.println("Name is " + name);
        System.out.println("Age is " + age);
    }
}

class Employee extends Person {

    int salary;

    public Employee(String name, int age, int salary){
        super(name,age);
        this.salary=salary;
    }

    public void displayEmployee() {
        displayPerson();
        System.out.println("Salary is " + salary);
    }
}

class Practice {
    public static void main(String args[]) {

        Employee emp = new Employee("Anika",25,87000);
        emp.displayEmployee();

    }
}