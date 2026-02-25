class Stringexample{
    public static void main(String args[]){
        String name = "Anika";
        String a = "Anika";
        String b = "Anika";
        System.out.println(name.length()); //5
        System.out.println(name.charAt(2)); //i
        System.out.println(name.substring(1,4)); //nik
        System.out.println(name.indexOf("k")); //3
        System.out.println(name.toUpperCase()); //ANIKA
        System.out.println(name.toLowerCase()); //anika
        System.out.println(a==b); //true -> compares memory address
        System.out.println(a.equals(b)); //true -> compares text values
    }
}