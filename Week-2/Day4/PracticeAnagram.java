class PracticeAnagram{
    public static void main(String args[]){
        String str1 = "silent";
        String str2 = "listen";

        //Normalize the string
        str1 = str1.toLowerCase().replace(" ","");
        str2 = str2.toLowerCase().replace(" ","");

        if(str1.length() != str2.length()){
            System.out.println("Not an anagram!");
            return;
        }

        //create a freq array of size 26 where values initially are 0
        int freqarr[] = new int [26];
        //for each char in str1 go to that index in freq array and increase the count
        for(int i=0;i<str1.length();i++){
            int index = str1.charAt(i)-'a';
            freqarr[index]++;
        }
        //for each char in str2 go to that index in freq array and decrease the count
        for(int i=0;i<str2.length();i++){
            int index = str2.charAt(i)-'a';
            freqarr[index]--;
        }
        //check if all values in freq array are 0 then anagram else not
        for(int i = 0; i < freqarr.length; i++){
            if(freqarr[i] != 0){
                System.out.println("Not an anagram!");
                return;
            }
        }

        System.out.println("It is an anagram!");


    }
}