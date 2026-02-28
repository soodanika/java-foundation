class Practice5{
    public static void main(String args[]){
        String str = "aaabbccccd";

        str = str.toLowerCase().replace(" ","");

        int freqarr[] = new int [26];

        for(int i=0;i<str.length();i++){
            freqarr[str.charAt(i)-'a']++;
        }

        for(int i=0;i<freqarr.length;i++){
            if(freqarr[i]!=0){
                System.out.print((char)(i+'a'));
                System.out.print(freqarr[i]);
            }
        }
    }
}