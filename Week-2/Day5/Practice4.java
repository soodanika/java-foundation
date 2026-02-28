class Practice4{
    public static void main(String args[]){
        String str = "The quick brown fox jumps over a lazy dog";

        str = str.toLowerCase().replace(" ","");

        int freqarr[] = new int [26];

        for(int i=0;i<str.length();i++){
            freqarr[str.charAt(i)-'a']++;
        }

        for(int i=0;i<freqarr.length;i++){
            if(freqarr[i]==0){
                System.out.println("Its not a Panagram!");
                return;
            }
        }

        System.out.println("Its a Panagram!!");
    }
}