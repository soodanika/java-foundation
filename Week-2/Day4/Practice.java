class Practice{
    public static void main(String args[]){
        String str = "banana";
        //create a freq array for characters
        int freq[] = new int [26]; //for all 26 characters initialize as 0

        //loop through the str and for each char do char - 'a'
        //it will internally take the ASCII values
        //then go to that index in freq array and increase the freq
        // to print the frequency array we can add back 'a' to the index and get the char with freq
        for(int i=0;i<str.length();i++){
            int index  = str.charAt(i)-'a';
            freq[index]++;
        }

        //Printing freq array
        for(int i=0;i<freq.length;i++){
            if(freq[i]>0){
                System.out.println((char)(i+'a')+" | "+ freq[i]);
            }
        }
    }
}