class Calculator{

    //Method Overloading - can have same method name but diff no./type of parameters
    public int add(int a, int b){
        return a+b;
    }

    public int add(int a, int b,int c){
        return a+b+c;
    }
}

class MethodOverloading{
    public static void main (String args[]){
        Calculator obj = new Calculator();
        int result = obj.add(1,2,3);
        System.out.println(result);
    }
}