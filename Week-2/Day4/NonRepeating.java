class NonRepeating{
    public static void main(String args[]){
        String str = "Anikan";

        //Normalize
        str = str.toLowerCase().replace(" ","");

        //create a freq arrray to store the frequency of each char in the word
        int freqarr[] = new int [26];

        //loop through the str and increase the freq
        for(int i=0;i<str.length();i++){
            int index = str.charAt(i)-'a';
            freqarr[index]++;
        }

        //Loop through the str and look for first char that has freq=1
        for(int i=0;i<str.length();i++){
            int index = str.charAt(i)-'a';
            if(freqarr[index]==1){
                System.out.println(str.charAt(i));
                return;
            }
        }

    }
}