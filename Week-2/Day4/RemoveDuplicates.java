class RemoveDuplicates{
    public static void main(String args[]){
        String str = "Anika";

        //Normalize
        str = str.toLowerCase().replace(" ","");

        //visited array
        boolean visited[] = new boolean[26];

        for(int i=0;i<str.length();i++){
            int index = str.charAt(i)-'a';
            if(!visited[index]){
                System.out.print((char)(index+'a'));
                visited[index] = true;
            }
        }
    }
}