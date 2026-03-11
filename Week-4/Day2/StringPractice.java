class StringPractice{
    public static void main(String args[]){
//        String s1 = "hello world ";
//        String s2 = "Hello World";
//        String arr[] = s1.split(" ");

//        System.out.println(s1.length());
//        System.out.println(s1.charAt(4));
//        System.out.println(s1.substring(6,11));
//        System.out.println(s1.equals(s2));
//        System.out.println(s1.equalsIgnoreCase(s2));
//        System.out.println(s1.contains("l"));
//        System.out.println(s1.indexOf('w'));
//        System.out.println(s1.toUpperCase());
//        System.out.println(s2.toLowerCase());
//        System.out.println(s1.trim());
//        System.out.println(arr[1]);

        StringBuilder name = new StringBuilder("Anika");
        name.append(" Sood");

        name.insert(10, " Sud");
        name.delete(6,10);
        name.reverse();

        System.out.println(name);
    }
}