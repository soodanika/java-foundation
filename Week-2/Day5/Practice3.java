class Practice3{
    public static void main(String args[]){
        String str1 = "Dirty Room";
        String str2 = "Dormitory";

        str1 = str1.toLowerCase().replace(" ","");
        str2 = str2.toLowerCase().replace(" ","");

        int freqarr[] = new int [26];

        for(int i=0;i<str1.length();i++){
            freqarr[str1.charAt(i)-'a']++;
        }

        for(int i=0;i<str2.length();i++){
            freqarr[str2.charAt(i)-'a']--;
        }

        for(int i=0;i<freqarr.length;i++){
            if(freqarr[i]!=0){
                System.out.println("Not an anagram!");
                return;
            }
        }
        System.out.println("Its an anagram!");

    }
}