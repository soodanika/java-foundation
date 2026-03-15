class Practice4{
    public static void main(String args[]){
        String str = "Programming";
        str = str.toLowerCase();

        boolean visited[] = new boolean[26];
        StringBuilder result = new StringBuilder();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(!visited[ch-'a']){
                visited[ch-'a'] = true;
                result.append(ch);
            }
        }

        System.out.println(result);
    }
}