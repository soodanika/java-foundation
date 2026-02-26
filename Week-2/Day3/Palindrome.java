class Palindrome{
    public static void main(String srags[]){
        String str = "Anika";
        //1. Normalize
        str = str.toLowerCase().replace(" ","");

        //2. Reverse
        String reverse = "";
        int length = str.length();
        for(int i=length-1;i>=0;i--){
            reverse += str.charAt(i);
        }

        //3. Check for palindrome
        if(reverse.equals(str)){
            System.out.println("String is a Palindrome!!");
        } else{
            System.out.println("String is not a Palindrome!!");
        }


    }
}