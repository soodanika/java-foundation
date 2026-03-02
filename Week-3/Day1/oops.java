//class Calculator{
//    int a = 0;
//     public int add(int a,int b){
//         return a+b;
//     }
//}
//
//class oops{
//    public static void main(String args[]){
//        Calculator cal = new Calculator();
//        int result = cal.add(4,5);
//        System.out.println(result);
//    }
//}

class Employee{
    private String name;
    private int empid;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }
}

class oops{
    public static void main(String args[]){
        Employee emp = new Employee();
        emp.setname("Anikaaa");
        emp.setempid(62280933);
        System.out.println(emp.getempid());
        System.out.println(emp.getname());

    }
}