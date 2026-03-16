class Practice2{
    public static void main(String args[]){
        String str = "Java is a powerful programming language";
        String arr [] = str.split(" ");
        String word = "";
        for(int i=0;i<arr.length;i++){
            if(word.length()<arr[i].length()){
                word = arr[i];
            }
        }
        System.out.println(word);
    }
}