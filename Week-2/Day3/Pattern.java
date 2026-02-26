class Pattern{
    public static void main(String args[]){
        String str = "Abc123XyZ!";

        int length = str.length();
        int upcount = 0;
        int lowcount = 0;
        int digitcount = 0;
        int charcount = 0;


        for(int i=0;i<length;i++){
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                upcount++;
            } else if(Character.isLowerCase(ch)){
                lowcount++;
            } else if(Character.isDigit(ch)){
                digitcount++;
            } else
                charcount++;
        }

        System.out.println("Upper Case count - "+ upcount);
        System.out.println("Lower Case count - "+ lowcount);
        System.out.println("Digit count - "+ digitcount);
        System.out.println("Special Char count - "+ charcount);

    }
}