class Reverse{
    public static void main(String args[]){
        String name = "silent";
        String reverse = "";
        int length = name.length();
        for(int i=length-1;i>=0;i--){
            reverse += name.charAt(i);
        }
        System.out.println("Reverse string is "+ reverse);
    }
}