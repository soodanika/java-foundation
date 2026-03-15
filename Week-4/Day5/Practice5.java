class Practice5{
    public static void main(String args[]){
        String str = "Java is a powerful programming language";
        String arr[] = str.split(" ");

        int max = Integer.MIN_VALUE;
        String maxword = "";
        int secondmax = Integer.MIN_VALUE;
        String secondmaxword = "";

        for(int i=0;i<arr.length;i++){
            String word = arr[i];

            if(word.length() > max){
                secondmax = max;
                secondmaxword = maxword;

                max = word.length();
                maxword = word;
            }
            else if(word.length() > secondmax && word.length() < max){
                secondmax = word.length();
                secondmaxword = word;
            }
        }

        System.out.println(secondmaxword);
    }
}