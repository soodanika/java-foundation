class PalindromString{
    public static void main(String args[]){
        String str = "madam";

        StringBuilder reverse = new StringBuilder();

        for(int i=str.length()-1;i>=0;i--){
            reverse.append(str.charAt(i));
        }

        if(str.equals(reverse.toString())){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}