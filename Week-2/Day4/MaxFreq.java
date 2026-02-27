class MaxFreq{
    public static void main(String args[]){
        String str = "Anika";

        //Normalize
        str = str.toLowerCase().replace(" ","");

        //create a freq array
        int freqarr[] = new int[26];

        //loop through the str and increase the freq of each char in fre array
        for(int i=0;i<str.length();i++){
            freqarr[str.charAt(i)-'a']++;
        }

        //loop through the final freq arry and find the max value
        int max = 0;
        char ch = ' ';
        for(int i=0;i<freqarr.length;i++){
            if(max<freqarr[i]){
                max = freqarr[i];
                ch = (char)(i + 'a');
            }
        }

        System.out.println("Character "+ ch+ " appears "+ max+" times.");
    }
}