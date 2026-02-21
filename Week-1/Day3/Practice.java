class Practice {
    public static void main(String args[]){
//        int num = 1234;
//        int reverse =0;
//        while(num!=0){
//            reverse = reverse*10 + (num%10);
//            num=num/10;
//        }
//        if(reverse==num){
//            System.out.println("Its a plaindrome");
//        }
//        else{
//            System.out.println("Its not a plaindrome " + reverse);
//        }

        //Sum of digits

//        int num = 1234;
//        int sum = 0;
//
//        while(num!=0){
//            sum += num%10;
//            num = num/10;
//        }
//        System.out.println(sum);

        // Factorial

//        int num = 5;
//        int fact = 1;
//
//        while (num>=1){
//            fact *=num;
//            num--;
//        }
//        System.out.println(fact);

        //No. of Didgits in a num
//        int num = 123455;
//        int digitCount =0;
//
//        while(num!=0){
//            num = num/10;
//            digitCount++;
//        }
//        System.out.println(digitCount);

        //Reverse a number

        int num = 12345;
        int reverse =0;

        while(num!=0){
            reverse = reverse*10 + (num%10);
            num = num/10;
        }
        System.out.println(reverse);
    }
}