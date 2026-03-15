class Practice1{
    public static void main(String args[]){
        String str = "Java is fun";
        String arr[] = str.split(" ");
        StringBuilder result = new StringBuilder();

        for(int i=0;i<arr.length;i++){
            StringBuilder temp = new StringBuilder(arr[i]);
            result.append(temp.reverse()+" ");
        }
        System.out.println(result);
    }
}