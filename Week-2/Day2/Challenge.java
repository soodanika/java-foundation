import java.util.Arrays;
class Challenge{
    public static void main(String args[]){
        String word1 = "Dormitory";
        String word2 = "Dirty Room";
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();

        int length1 = word1.length();
        int length2 = word2.length();

        String word1fixed = "";
        String word2fixed = "";
        for(int i=0;i<length1;i++){
            char ch = word1.charAt(i);
            if(ch!=' '){
                word1fixed += ch;
            }
        }

        for(int i=0;i<length2;i++){
            char ch = word2.charAt(i);
            if(ch!=' '){
                word2fixed += ch;
            }
        }

        System.out.println(word1fixed);
        System.out.println(word2fixed);

        //Check anagram

        int word1fixedlength = word1fixed.length();
        int word2fixedlength = word2fixed.length();

        //Convert to char arrays

        char[] word1arr = word1fixed.toCharArray();
        char[] word2arr = word2fixed.toCharArray();

//        char word1arr [] = new char [word1fixedlength];
//        char word2arr [] = new char [word2fixedlength];
//
//        for(int i=0;i<word1fixedlength;i++){
//            word1arr[i] = word1fixed.charAt(i);
//        }
//
//        for(int i=0;i<word2fixedlength;i++){
//            word2arr[i] = word2fixed.charAt(i);
//        }
//
        for(int i=0;i<word1fixedlength;i++){
            System.out.print(word1arr[i]+ " ");
        }
        System.out.println();

        for(int i=0;i<word2fixedlength;i++){
            System.out.print(word2arr[i]+ " ");
        }
        System.out.println();
        System.out.println("------------");
        //Sort Array

        Arrays.sort(word1arr);
        Arrays.sort(word2arr);

        for(int i=0;i<word1fixedlength;i++){
            System.out.print(word1arr[i]+ " ");
        }
        System.out.println();

        for(int i=0;i<word2fixedlength;i++){
            System.out.print(word2arr[i]+ " ");
        }

        //Compare
        boolean isAnagram = true;

        for (int i = 0; i < word1arr.length; i++) {
            if (word1arr[i] != word2arr[i]) {
                isAnagram = false;
                break;
            }
        }

        if (isAnagram) {
            System.out.println("Anagram!");
        } else {
            System.out.println("Not Anagram!");
        }


    }
}