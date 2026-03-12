class Practice{
    public static void main(String args[]){
        String str = "Java is a powerful programming language";
        String arr[] = str.split(" ");
        String result="";

        for(int i=0;i<arr.length;i++){
            if(arr[i].length()>result.length()){
                result=arr[i];
            }
        }

        System.out.println(result);

    }
}