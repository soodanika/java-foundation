class Palindrome{
    public boolean palindrome(int num){
        //to check palindrom reverse the num and check if reverse == num

        int reverse = 0;
        int originalNum = num;
        while(num>0){
            reverse = (reverse*10+(num%10));
            num = num/10;
        }

        if (reverse == originalNum)
            return true;
        return false;
    }
}

class Count{
    public int count(int num){
        int count = 0;
        while(num>0){
            count++;
            num = num/10;
        }
        return count;
    }
}

class Challenge{
    public static void main(String args[]){
//        Palindrome obj = new Palindrome();
//        boolean result = obj.palindrome(1321);

        Count obj = new Count();
        int result = obj.count(1234);
        System.out.println(result);
    }
}