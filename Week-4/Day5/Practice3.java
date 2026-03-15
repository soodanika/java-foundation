class Practice3{
    public static void main(String args[]){
        String str1 = "silent";
        String str2 = "listen";
        int freq[] = new int[26];

        for(int i=0;i<str1.length();i++){
            char ch = str1.charAt(i);
            freq[ch-'a']++;
        }
        for(int i=0;i<str2.length();i++){
            char ch = str2.charAt(i);
            freq[ch-'a']--;
        }

        for(int i=0;i< freq.length;i++){
            if(freq[i]!=0){
                System.out.println("Not anagram");
                return;
            }
        }

        System.out.println("Anagram");

    }
}