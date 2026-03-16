class A{
    public A(){
        System.out.println("Parent Constructor");
    }

    public A(int n){
        System.out.println("Parent Constructor with int");
    }
}

class B extends A{
    public B(){
        super(5);
        System.out.println("Child Constructor");
    }

    public B(int a){
        this();
        System.out.println("Child Constructor with int");
    }
}

class Super{
    public static void main(String args[]){
        B obj = new B(5);
    }
        }