class Practice1{
    public static void main(String args[]){
//        String str = "Programming";
//        str = str.toLowerCase();
//        int count = 0;
//        int count2 = 0;
//
//        for(int i=0;i<str.length();i++){
//            char ch = str.charAt(i);
//            if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'){
//                count++;
//            } else {
//                count2++;
//            }
//        }
//
//        System.out.println("Vowels = "+count);
//        System.out.println("Consonants = "+count2);

//        String str = "Java";
//        StringBuilder result = new StringBuilder();
//        for(int i=str.length()-1;i>=0;i--){
//            result.append(str.charAt(i));
//        }
//        System.out.println(result);

//        String str = "Java is powerful";
//        String arr[] = str.split(" ");
//        StringBuilder result = new StringBuilder();
//
//        for(int i=arr.length-1;i>=0;i--){
//            result.append(arr[i]+" ");
//        }
//        System.out.println(result);

        String str = "Java is a powerful programming language";
        String arr[] = str.split(" ");
        String maxword = "";
        String secondmaxword = "";

        for(String word : arr){
            if(word.length() > maxword.length()){
                secondmaxword = maxword;
                maxword = word;
            } else if(word.length() >= secondmaxword.length() && word.length()!=maxword.length()){
                secondmaxword = word;
            }
        }
        System.out.println("Second largest word: "+secondmaxword);
    }
}