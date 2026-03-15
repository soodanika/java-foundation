class Practice2{
    public static void main(String args[]){
        String str = "swiss";
        int freq[] = new int[26];

        str = str.toLowerCase();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            freq[ch-'a']++;
        }

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(freq[ch-'a']==1){
                System.out.println(ch);
                break;
            }
        }
    }
}