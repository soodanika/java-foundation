class NonRepeating{
    public static void main(String args[]){
        //1. Normalize
        //2. Return 1st char thats non repeating
            //- convert to array
            //- two loops to check for checking duplicates
        //3. If all repeate give proper msg

        String word = "Swiss ";

        //Normalize
        word = word.toLowerCase();
        String wordfixed ="";
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)!=' '){
                wordfixed += word.charAt(i);
            }
        }

        //Convert to array
        char[] wordarr = wordfixed.toCharArray();

        //loops to check duplicate

        for(int i=0;i<wordarr.length-1;i++){
            boolean isUnique = true;
            for(int j=0;j<wordarr.length;j++){
                if(i!=j && wordarr[i]==wordarr[j]){
                    isUnique = false;
                    break;
                }
            }
            if(isUnique){
                System.out.println(wordarr[i]);
                return;
            }
        }

        System.out.println("No non-repeating character");

    }
}