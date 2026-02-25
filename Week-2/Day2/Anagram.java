//Anagram -> Listen - Silent

//1. Normalize the strings - lower case +  remove space
//2. Convert to char array
//3. Sort the array
//4. Compare the array

import java.util.Arrays;
class Anagram{
    public static void main(String args[]){
        String word1 = "Silent";
        String word2 = "Listen";
        //1. Normalize the strings - lower case +  remove space
        //Lower case conversion
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();

        //Removing spaces
        String word1fixed ="";
        String word2fixed ="";
        for(int i=0;i<word1.length();i++){
            if(word1.charAt(i)!=' '){
                word1fixed += word1.charAt(i);
            }
        }

        for(int i=0;i<word2.length();i++){
            if(word2.charAt(i)!=' '){
                word2fixed += word2.charAt(i);
            }
        }

        //2. Convert to char array
        char[] word1arr = word1fixed.toCharArray();
        char[] word2arr = word2fixed.toCharArray();

        //3. Sort the array
        Arrays.sort(word1arr);
        Arrays.sort(word2arr);

        //4. Compare the array

        boolean isAnagram = true;

        if(word1arr.length!=word2arr.length){
            System.out.println("Words are not anagrams!!");
            return;
        }

        for(int i=0;i<word1arr.length;i++){
            if(word1arr[i]!=word2arr[i]){
                isAnagram = false;
                break;
            }
        }

        if(isAnagram){
            System.out.println("Words are anagram!!");
        } else {
            System.out.println("Words are not anagram!!");
        }


    }
}

