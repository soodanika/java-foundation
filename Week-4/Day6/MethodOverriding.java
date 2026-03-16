class A{
    public void add(int a, int b){
        System.out.println(a+b);
    }
    public void sub(int a, int b){
        System.out.println(a-b);
    }
}

class B extends A{
    public void add(int a, int b){
        System.out.println(a+b+1);
    }
}
class MethodOverriding{
    public static void main(String args[]){
        B obj = new B();
        obj.add(5,5);
        obj.sub(5,5);
    }
}