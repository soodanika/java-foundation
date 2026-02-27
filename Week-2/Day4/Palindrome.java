class Palindrome{
    public static void main(String args[]){
        String str = "madam";

        //Normalize
        str = str.toLowerCase().replace(" ","");

        //Initialize the reverse string
        String reverse = "";

        //loop through the str and reverse the str
        for(int i=str.length()-1;i>=0;i--){
            reverse += str.charAt(i);
        }

        //Compare the reverse str and str
        if(reverse.equals(str)){
            System.out.println("It is a palindrome string!");
        } else {
            System.out.println("Its not a palindrome string!");
        }
    }
}