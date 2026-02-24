//Add 2 numbers
//class Add{
//    public int add(int a, int b){
//        return a+b;
//    }
//}
//
//class Practice{
//    public static void main(String args[]){
//        Add obj = new Add();
//        int result = obj.add(4,6);
//        System.out.println(result);
//    }
//}

//Check even odd
//class EvenOdd{
//    public String evenodd(int num){
//        if (num%2==0)
//            return "Even";
//        return "Odd";
//    }
//}

//max of 3
//class Max{
//    public int max(int a,int b, int c){
//        if(a>b && a>c)
//            return a;
//        else if(b>a && b>c)
//            return b;
//        return c;
//    }
//}

//Factorial
//class Factorial{
//    public int factorial(int num){
//        int fact = 1;
//        while(num>0){
//            fact *=num;
//            num--;
//        }
//
//        return fact;
//    }
//}

//Reverse a number
class Reverse{
    public int reverse(int num){
        int reverse = 0;
        while(num>0){
            reverse = (reverse*10 + (num%10));
            num = num/10;
        }
        return reverse;
    }
}

class Practice{
    public static void main(String args[]){
//        EvenOdd obj = new EvenOdd();
//        String result = obj.evenodd(8);

//        Max obj = new Max();
//        int result = obj.max(1,2,3);

//        Factorial obj = new Factorial();
//        int result = obj.factorial(1);

        Reverse obj = new Reverse();
        int result = obj.reverse(12345);

        System.out.println(result);
    }
}