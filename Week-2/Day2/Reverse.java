class Reverse{
    public static void main(String args[]){
        String name = "My name is Anika";

        //Reverse a string
//        int length = name.length();
//        String reverse = "";
//        for(int i=length-1;i>=0;i--){
//            reverse = reverse + name.charAt(i);
//        }
//        System.out.println(reverse);

        //Palindrome -> reverse and check if equal to original string

//        int length = name.length();
//        String reverse = "";
//        for(int i=length-1;i>=0;i--){
//            reverse += name.charAt(i);
//        }
//
//        if(reverse.equals(name))
//            System.out.println("Its a palindrome");
//        else
//            System.out.println("Its not a palindrome");

        //Count Vowels
//        int length = name.length();
//        int count = 0;
//        name = name.toLowerCase();
//        for(int i=0;i<length;i++){
//            char ch = name.charAt(i);
//            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
//                count++;
//            }
//        }
//        System.out.println(count);

        //Remove spaces
//        int length = name.length();
//        String result = "";
//        for(int i=0;i<length;i++){
//            char ch = name.charAt(i);
//            if(ch!=' '){
//                result += ch;
//            }
//        }
//        System.out.println(result);

        //Freq of char
        name = name.toLowerCase();
        int length = name.length();
        int freq =0;
        for(int i=0;i<length;i++){
            char ch = name.charAt(i);
            if(ch=='a'){
                freq++;
            }
        }
        System.out.println(freq);

    }
}