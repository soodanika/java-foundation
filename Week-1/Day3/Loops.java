class Loops {
    public static void main(String args[]){
        //Print num 1-10
//        for (int i=1;i<=10;i++){
//            System.out.println(i);
//        }

        //Print even num 1-20
//        for (int i=1;i<=20;i++){
//            if (i%2==0){
//                System.out.println(i);
//            }
//        }

        //Print 10-1
//        for (int i=10;i>=1;i--){
//            System.out.println(i);
//        }

        //sum of 1-10
//        int sum =0;
//        for (int i=1;i<=10;i++){
//            sum +=i;
//        }
//        System.out.println(sum);

        //Table of 5
//        for(int i=5;i<=50;i++){
//            if(i%5==0){
//                System.out.println(i);
//            }
//        }

        // Factorial
//        int num = 0;
//        int fact = 1;
//        for(int i=1;i<=num;i++)
//        {
//            fact *=i;
//        }
//        System.out.println(fact);

        //Count digits in num
        int num = 543216789;
        int digitCount=0;
        while(num!=0) {
            num = num / 10;
            digitCount ++;
        }
        System.out.println(digitCount);
    }
}