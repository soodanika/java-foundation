class ExtendedFreq{
    public static void main(String args[]){
        String str = "AaB12bA3";

        //freq arrays
        int lower[] = new int [26];
        int upper[] = new int [26];
        int digit[] = new int [10];

        //loop through the array and increase the freq for each char in respective freqarr
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isLowerCase(ch)){
                lower[ch-'a']++;
            } else if(Character.isUpperCase(ch)){
                upper[ch-'A']++;
            } else {
                digit[ch-'0']++;
            }
        }

        //loop through each freq array and print the freq
        for(int i = 0; i < 26; i++){
            if(lower[i] > 0){
                System.out.println((char)(i + 'a') + " | " + lower[i]);
            }
        }

        for(int i = 0; i < 26; i++){
            if(upper[i] > 0){
                System.out.println((char)(i + 'A') + " | " + upper[i]);
            }
        }

        for(int i = 0; i < 10; i++){
            if(digit[i] > 0){
                System.out.println((char)(i + '0') + " | " + digit[i]);
            }
        }

    }
}