class CountWords{
    public static void main(String args[]){
        String sentence = " I love Java      programming  ";

        sentence = sentence.trim(); // remove leading & trailing spaces

        if(sentence.isEmpty()){
            System.out.println(0);
        } else {
            String words[] = sentence.split("\\s+");
            System.out.println(words.length);
        }
    }
}