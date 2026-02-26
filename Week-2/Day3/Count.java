class Count{
    public static void main(String args[]){
        String str = "Anika is 26 years old";
        int digitCount = 0;
        int letterCount = 0;

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                digitCount++;
            } else if(Character.isLetter(ch)){
                letterCount++;
            }
        }

        System.out.println("No of Digits in "+str+ " is "+ digitCount);
        System.out.println("No of Letters in "+str+ " is "+ letterCount);

    }
}