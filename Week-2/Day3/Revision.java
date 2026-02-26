class Revision{
    public static void main(String args[]){
        String name = "Anika";
        char ch = name.charAt(1);
        System.out.println(name.charAt(1)); //n
        System.out.println(name.length()); //5
        System.out.println(Character.isDigit(ch)); // false
        System.out.println(Character.isLetter(ch)); //true
        System.out.println(Character.isUpperCase(ch)); //false
        System.out.println(Character.isLowerCase(ch)); //true
    }
}